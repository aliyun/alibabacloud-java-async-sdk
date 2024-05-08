// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DryRunSwaggerRequest} extends {@link RequestModel}
 *
 * <p>DryRunSwaggerRequest</p>
 */
public class DryRunSwaggerRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Data")
    @com.aliyun.core.annotation.Validation(required = true)
    private String data;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataFormat")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dataFormat;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GlobalCondition")
    private java.util.Map < String, ? > globalCondition;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Overwrite")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean overwrite;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    private DryRunSwaggerRequest(Builder builder) {
        super(builder);
        this.data = builder.data;
        this.dataFormat = builder.dataFormat;
        this.globalCondition = builder.globalCondition;
        this.groupId = builder.groupId;
        this.overwrite = builder.overwrite;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DryRunSwaggerRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public String getData() {
        return this.data;
    }

    /**
     * @return dataFormat
     */
    public String getDataFormat() {
        return this.dataFormat;
    }

    /**
     * @return globalCondition
     */
    public java.util.Map < String, ? > getGlobalCondition() {
        return this.globalCondition;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return overwrite
     */
    public Boolean getOverwrite() {
        return this.overwrite;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<DryRunSwaggerRequest, Builder> {
        private String data; 
        private String dataFormat; 
        private java.util.Map < String, ? > globalCondition; 
        private String groupId; 
        private Boolean overwrite; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(DryRunSwaggerRequest request) {
            super(request);
            this.data = request.data;
            this.dataFormat = request.dataFormat;
            this.globalCondition = request.globalCondition;
            this.groupId = request.groupId;
            this.overwrite = request.overwrite;
            this.securityToken = request.securityToken;
        } 

        /**
         * The Swagger text content.
         */
        public Builder data(String data) {
            this.putBodyParameter("Data", data);
            this.data = data;
            return this;
        }

        /**
         * The Swagger text format:
         * <p>
         * 
         * *   json
         * *   yaml
         */
        public Builder dataFormat(String dataFormat) {
            this.putQueryParameter("DataFormat", dataFormat);
            this.dataFormat = dataFormat;
            return this;
        }

        /**
         * The global condition.
         */
        public Builder globalCondition(java.util.Map < String, ? > globalCondition) {
            String globalConditionShrink = shrink(globalCondition, "GlobalCondition", "json");
            this.putQueryParameter("GlobalCondition", globalConditionShrink);
            this.globalCondition = globalCondition;
            return this;
        }

        /**
         * The ID of the API group.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * Specifies whether to overwrite the existing API.
         * <p>
         * 
         * APIs with the same HTTP request type and backend request path are considered the same.
         */
        public Builder overwrite(Boolean overwrite) {
            this.putQueryParameter("Overwrite", overwrite);
            this.overwrite = overwrite;
            return this;
        }

        /**
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        @Override
        public DryRunSwaggerRequest build() {
            return new DryRunSwaggerRequest(this);
        } 

    } 

}
