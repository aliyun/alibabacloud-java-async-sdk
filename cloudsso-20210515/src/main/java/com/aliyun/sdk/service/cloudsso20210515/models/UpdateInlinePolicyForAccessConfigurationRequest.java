// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateInlinePolicyForAccessConfigurationRequest} extends {@link RequestModel}
 *
 * <p>UpdateInlinePolicyForAccessConfigurationRequest</p>
 */
public class UpdateInlinePolicyForAccessConfigurationRequest extends Request {
    @Query
    @NameInMap("AccessConfigurationId")
    private String accessConfigurationId;

    @Query
    @NameInMap("DirectoryId")
    private String directoryId;

    @Query
    @NameInMap("InlinePolicyName")
    private String inlinePolicyName;

    @Query
    @NameInMap("NewInlinePolicyDocument")
    private String newInlinePolicyDocument;

    private UpdateInlinePolicyForAccessConfigurationRequest(Builder builder) {
        super(builder);
        this.accessConfigurationId = builder.accessConfigurationId;
        this.directoryId = builder.directoryId;
        this.inlinePolicyName = builder.inlinePolicyName;
        this.newInlinePolicyDocument = builder.newInlinePolicyDocument;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateInlinePolicyForAccessConfigurationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessConfigurationId
     */
    public String getAccessConfigurationId() {
        return this.accessConfigurationId;
    }

    /**
     * @return directoryId
     */
    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * @return inlinePolicyName
     */
    public String getInlinePolicyName() {
        return this.inlinePolicyName;
    }

    /**
     * @return newInlinePolicyDocument
     */
    public String getNewInlinePolicyDocument() {
        return this.newInlinePolicyDocument;
    }

    public static final class Builder extends Request.Builder<UpdateInlinePolicyForAccessConfigurationRequest, Builder> {
        private String accessConfigurationId; 
        private String directoryId; 
        private String inlinePolicyName; 
        private String newInlinePolicyDocument; 

        private Builder() {
            super();
        } 

        private Builder(UpdateInlinePolicyForAccessConfigurationRequest response) {
            super(response);
            this.accessConfigurationId = response.accessConfigurationId;
            this.directoryId = response.directoryId;
            this.inlinePolicyName = response.inlinePolicyName;
            this.newInlinePolicyDocument = response.newInlinePolicyDocument;
        } 

        /**
         * AccessConfigurationId.
         */
        public Builder accessConfigurationId(String accessConfigurationId) {
            this.putQueryParameter("AccessConfigurationId", accessConfigurationId);
            this.accessConfigurationId = accessConfigurationId;
            return this;
        }

        /**
         * DirectoryId.
         */
        public Builder directoryId(String directoryId) {
            this.putQueryParameter("DirectoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        /**
         * InlinePolicyName.
         */
        public Builder inlinePolicyName(String inlinePolicyName) {
            this.putQueryParameter("InlinePolicyName", inlinePolicyName);
            this.inlinePolicyName = inlinePolicyName;
            return this;
        }

        /**
         * NewInlinePolicyDocument.
         */
        public Builder newInlinePolicyDocument(String newInlinePolicyDocument) {
            this.putQueryParameter("NewInlinePolicyDocument", newInlinePolicyDocument);
            this.newInlinePolicyDocument = newInlinePolicyDocument;
            return this;
        }

        @Override
        public UpdateInlinePolicyForAccessConfigurationRequest build() {
            return new UpdateInlinePolicyForAccessConfigurationRequest(this);
        } 

    } 

}
