// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateStackTemplateByResourcesRequest} extends {@link RequestModel}
 *
 * <p>UpdateStackTemplateByResourcesRequest</p>
 */
public class UpdateStackTemplateByResourcesRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("LogicalResourceId")
    private java.util.List < String > logicalResourceId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("StackId")
    @Validation(required = true)
    private String stackId;

    @Query
    @NameInMap("TemplateFormat")
    private String templateFormat;

    private UpdateStackTemplateByResourcesRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.logicalResourceId = builder.logicalResourceId;
        this.regionId = builder.regionId;
        this.stackId = builder.stackId;
        this.templateFormat = builder.templateFormat;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateStackTemplateByResourcesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return logicalResourceId
     */
    public java.util.List < String > getLogicalResourceId() {
        return this.logicalResourceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return stackId
     */
    public String getStackId() {
        return this.stackId;
    }

    /**
     * @return templateFormat
     */
    public String getTemplateFormat() {
        return this.templateFormat;
    }

    public static final class Builder extends Request.Builder<UpdateStackTemplateByResourcesRequest, Builder> {
        private String clientToken; 
        private Boolean dryRun; 
        private java.util.List < String > logicalResourceId; 
        private String regionId; 
        private String stackId; 
        private String templateFormat; 

        private Builder() {
            super();
        } 

        private Builder(UpdateStackTemplateByResourcesRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.logicalResourceId = request.logicalResourceId;
            this.regionId = request.regionId;
            this.stackId = request.stackId;
            this.templateFormat = request.templateFormat;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
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
         * LogicalResourceId.
         */
        public Builder logicalResourceId(java.util.List < String > logicalResourceId) {
            this.putQueryParameter("LogicalResourceId", logicalResourceId);
            this.logicalResourceId = logicalResourceId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * StackId.
         */
        public Builder stackId(String stackId) {
            this.putQueryParameter("StackId", stackId);
            this.stackId = stackId;
            return this;
        }

        /**
         * TemplateFormat.
         */
        public Builder templateFormat(String templateFormat) {
            this.putQueryParameter("TemplateFormat", templateFormat);
            this.templateFormat = templateFormat;
            return this;
        }

        @Override
        public UpdateStackTemplateByResourcesRequest build() {
            return new UpdateStackTemplateByResourcesRequest(this);
        } 

    } 

}
