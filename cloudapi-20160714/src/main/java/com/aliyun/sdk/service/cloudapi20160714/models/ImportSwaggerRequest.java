// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ImportSwaggerRequest} extends {@link RequestModel}
 *
 * <p>ImportSwaggerRequest</p>
 */
public class ImportSwaggerRequest extends Request {
    @Body
    @NameInMap("Data")
    @Validation(required = true)
    private String data;

    @Query
    @NameInMap("DataFormat")
    @Validation(required = true)
    private String dataFormat;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("GlobalCondition")
    private java.util.Map < String, ? > globalCondition;

    @Query
    @NameInMap("GroupId")
    @Validation(required = true)
    private String groupId;

    @Query
    @NameInMap("Overwrite")
    @Validation(required = true)
    private Boolean overwrite;

    @Query
    @NameInMap("SecurityToken")
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

    public static final class Builder extends Request.Builder<ImportSwaggerRequest, Builder> {
        private String data; 
        private String dataFormat; 
        private Boolean dryRun; 
        private java.util.Map < String, ? > globalCondition; 
        private String groupId; 
        private Boolean overwrite; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(ImportSwaggerRequest response) {
            super(response);
            this.data = response.data;
            this.dataFormat = response.dataFormat;
            this.dryRun = response.dryRun;
            this.globalCondition = response.globalCondition;
            this.groupId = response.groupId;
            this.overwrite = response.overwrite;
            this.securityToken = response.securityToken;
        } 

        /**
         * Data.
         */
        public Builder data(String data) {
            this.putBodyParameter("Data", data);
            this.data = data;
            return this;
        }

        /**
         * DataFormat.
         */
        public Builder dataFormat(String dataFormat) {
            this.putQueryParameter("DataFormat", dataFormat);
            this.dataFormat = dataFormat;
            return this;
        }

        /**
         * DryRun.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * GlobalCondition.
         */
        public Builder globalCondition(java.util.Map < String, ? > globalCondition) {
            this.putQueryParameter("GlobalCondition", globalCondition);
            this.globalCondition = globalCondition;
            return this;
        }

        /**
         * GroupId.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * Overwrite.
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
