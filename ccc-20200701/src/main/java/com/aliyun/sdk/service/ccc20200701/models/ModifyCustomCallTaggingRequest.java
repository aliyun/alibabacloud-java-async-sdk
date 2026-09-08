// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

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
 * {@link ModifyCustomCallTaggingRequest} extends {@link RequestModel}
 *
 * <p>ModifyCustomCallTaggingRequest</p>
 */
public class ModifyCustomCallTaggingRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallTagNameList")
    private String callTagNameList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Number")
    @com.aliyun.core.annotation.Validation(required = true)
    private String number;

    private ModifyCustomCallTaggingRequest(Builder builder) {
        super(builder);
        this.callTagNameList = builder.callTagNameList;
        this.description = builder.description;
        this.instanceId = builder.instanceId;
        this.number = builder.number;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyCustomCallTaggingRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return callTagNameList
     */
    public String getCallTagNameList() {
        return this.callTagNameList;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return number
     */
    public String getNumber() {
        return this.number;
    }

    public static final class Builder extends Request.Builder<ModifyCustomCallTaggingRequest, Builder> {
        private String callTagNameList; 
        private String description; 
        private String instanceId; 
        private String number; 

        private Builder() {
            super();
        } 

        private Builder(ModifyCustomCallTaggingRequest request) {
            super(request);
            this.callTagNameList = request.callTagNameList;
            this.description = request.description;
            this.instanceId = request.instanceId;
            this.number = request.number;
        } 

        /**
         * <p>A list of number tag names. You must provide the complete list of number tags to be modified, and ensure that these number tags have already been created.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;TagA&quot;,&quot;TagB&quot;]</p>
         */
        public Builder callTagNameList(String callTagNameList) {
            this.putQueryParameter("CallTagNameList", callTagNameList);
            this.callTagNameList = callTagNameList;
            return this;
        }

        /**
         * <p>The new description for the inbound number mark. This parameter is optional. The default value is empty, which indicates that the description will not be modified.</p>
         * 
         * <strong>example:</strong>
         * <p>王先生</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc-test</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The number associated with the inbound number mark. The system matches the inbound number mark to be modified based on this number.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1312121****</p>
         */
        public Builder number(String number) {
            this.putQueryParameter("Number", number);
            this.number = number;
            return this;
        }

        @Override
        public ModifyCustomCallTaggingRequest build() {
            return new ModifyCustomCallTaggingRequest(this);
        } 

    } 

}
