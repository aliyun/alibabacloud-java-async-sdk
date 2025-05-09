// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

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
 * {@link ImportSwaggerRequest} extends {@link RequestModel}
 *
 * <p>ImportSwaggerRequest</p>
 */
public class ImportSwaggerRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Data")
    @com.aliyun.core.annotation.Validation(required = true)
    private String data;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataFormat")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dataFormat;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GlobalCondition")
    private java.util.Map<String, ?> globalCondition;

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

    private ImportSwaggerRequest(Builder builder) {
        super(builder);
        this.data = builder.data;
        this.dataFormat = builder.dataFormat;
        this.dryRun = builder.dryRun;
        this.globalCondition = builder.globalCondition;
        this.groupId = builder.groupId;
        this.overwrite = builder.overwrite;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ImportSwaggerRequest create() {
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
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return globalCondition
     */
    public java.util.Map<String, ?> getGlobalCondition() {
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

    public static final class Builder extends Request.Builder<ImportSwaggerRequest, Builder> {
        private String data; 
        private String dataFormat; 
        private Boolean dryRun; 
        private java.util.Map<String, ?> globalCondition; 
        private String groupId; 
        private Boolean overwrite; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(ImportSwaggerRequest request) {
            super(request);
            this.data = request.data;
            this.dataFormat = request.dataFormat;
            this.dryRun = request.dryRun;
            this.globalCondition = request.globalCondition;
            this.groupId = request.groupId;
            this.overwrite = request.overwrite;
            this.securityToken = request.securityToken;
        } 

        /**
         * <p>The Swagger text content.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;A Swagger API definition in YAML&quot;</p>
         */
        public Builder data(String data) {
            this.putBodyParameter("Data", data);
            this.data = data;
            return this;
        }

        /**
         * <p>The Swagger text format:</p>
         * <ul>
         * <li>json</li>
         * <li>yaml</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>yaml</p>
         */
        public Builder dataFormat(String dataFormat) {
            this.putQueryParameter("DataFormat", dataFormat);
            this.dataFormat = dataFormat;
            return this;
        }

        /**
         * <p>The pre-inspection.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The global conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder globalCondition(java.util.Map<String, ?> globalCondition) {
            String globalConditionShrink = shrink(globalCondition, "GlobalCondition", "json");
            this.putQueryParameter("GlobalCondition", globalConditionShrink);
            this.globalCondition = globalCondition;
            return this;
        }

        /**
         * <p>The ID of the API group to which the Swagger is imported.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0009db9c828549768a200320714b8930</p>
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>Specifies whether to overwrite the existing API.</p>
         * <p>APIs with the same HTTP request type and backend request path are considered the same.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
        public ImportSwaggerRequest build() {
            return new ImportSwaggerRequest(this);
        } 

    } 

}
