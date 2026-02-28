// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateParserRequest} extends {@link RequestModel}
 *
 * <p>UpdateParserRequest</p>
 */
public class UpdateParserRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParserId")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 9999999999D)
    private Long parserId;

    private UpdateParserRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.iotInstanceId = builder.iotInstanceId;
        this.name = builder.name;
        this.parserId = builder.parserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateParserRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return parserId
     */
    public Long getParserId() {
        return this.parserId;
    }

    public static final class Builder extends Request.Builder<UpdateParserRequest, Builder> {
        private String description; 
        private String iotInstanceId; 
        private String name; 
        private Long parserId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateParserRequest request) {
            super(request);
            this.description = request.description;
            this.iotInstanceId = request.iotInstanceId;
            this.name = request.name;
            this.parserId = request.parserId;
        } 

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * IotInstanceId.
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1001</p>
         */
        public Builder parserId(Long parserId) {
            this.putQueryParameter("ParserId", parserId);
            this.parserId = parserId;
            return this;
        }

        @Override
        public UpdateParserRequest build() {
            return new UpdateParserRequest(this);
        } 

    } 

}
