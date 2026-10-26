// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

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
 * {@link UpdateDataSourcePropertiesRequest} extends {@link RequestModel}
 *
 * <p>UpdateDataSourcePropertiesRequest</p>
 */
public class UpdateDataSourcePropertiesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DsId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dsId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QuickBIOwnerId")
    private String quickBIOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ShowName")
    private String showName;

    private UpdateDataSourcePropertiesRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.dsId = builder.dsId;
        this.quickBIOwnerId = builder.quickBIOwnerId;
        this.showName = builder.showName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDataSourcePropertiesRequest create() {
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
     * @return dsId
     */
    public String getDsId() {
        return this.dsId;
    }

    /**
     * @return quickBIOwnerId
     */
    public String getQuickBIOwnerId() {
        return this.quickBIOwnerId;
    }

    /**
     * @return showName
     */
    public String getShowName() {
        return this.showName;
    }

    public static final class Builder extends Request.Builder<UpdateDataSourcePropertiesRequest, Builder> {
        private String description; 
        private String dsId; 
        private String quickBIOwnerId; 
        private String showName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDataSourcePropertiesRequest request) {
            super(request);
            this.description = request.description;
            this.dsId = request.dsId;
            this.quickBIOwnerId = request.quickBIOwnerId;
            this.showName = request.showName;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>7AAB95D-*****-****-*4FC0C976</p>
         */
        public Builder dsId(String dsId) {
            this.putQueryParameter("DsId", dsId);
            this.dsId = dsId;
            return this;
        }

        /**
         * QuickBIOwnerId.
         */
        public Builder quickBIOwnerId(String quickBIOwnerId) {
            this.putQueryParameter("QuickBIOwnerId", quickBIOwnerId);
            this.quickBIOwnerId = quickBIOwnerId;
            return this;
        }

        /**
         * ShowName.
         */
        public Builder showName(String showName) {
            this.putQueryParameter("ShowName", showName);
            this.showName = showName;
            return this;
        }

        @Override
        public UpdateDataSourcePropertiesRequest build() {
            return new UpdateDataSourcePropertiesRequest(this);
        } 

    } 

}
