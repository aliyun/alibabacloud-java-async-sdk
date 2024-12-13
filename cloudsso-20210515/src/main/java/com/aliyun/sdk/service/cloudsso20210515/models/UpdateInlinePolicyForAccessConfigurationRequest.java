// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateInlinePolicyForAccessConfigurationRequest} extends {@link RequestModel}
 *
 * <p>UpdateInlinePolicyForAccessConfigurationRequest</p>
 */
public class UpdateInlinePolicyForAccessConfigurationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessConfigurationId")
    private String accessConfigurationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DirectoryId")
    private String directoryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InlinePolicyName")
    private String inlinePolicyName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewInlinePolicyDocument")
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

        private Builder(UpdateInlinePolicyForAccessConfigurationRequest request) {
            super(request);
            this.accessConfigurationId = request.accessConfigurationId;
            this.directoryId = request.directoryId;
            this.inlinePolicyName = request.inlinePolicyName;
            this.newInlinePolicyDocument = request.newInlinePolicyDocument;
        } 

        /**
         * <p>The ID of the access configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>ac-00jhtfl8thteu6uj****</p>
         */
        public Builder accessConfigurationId(String accessConfigurationId) {
            this.putQueryParameter("AccessConfigurationId", accessConfigurationId);
            this.accessConfigurationId = accessConfigurationId;
            return this;
        }

        /**
         * <p>The ID of the directory.</p>
         * 
         * <strong>example:</strong>
         * <p>d-00fc2p61****</p>
         */
        public Builder directoryId(String directoryId) {
            this.putQueryParameter("DirectoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        /**
         * <p>The name of the inline policy.</p>
         * 
         * <strong>example:</strong>
         * <p>InlinePolicy</p>
         */
        public Builder inlinePolicyName(String inlinePolicyName) {
            this.putQueryParameter("InlinePolicyName", inlinePolicyName);
            this.inlinePolicyName = inlinePolicyName;
            return this;
        }

        /**
         * <p>The new configurations of the inline policy.</p>
         * <p>The value can be up to 4,096 characters in length.</p>
         * <p>For more information about the syntax and structure of RAM policies, see <a href="https://help.aliyun.com/document_detail/93739.html">Policy syntax and structure</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Statement&quot;: [{&quot;Action&quot;: &quot;<em>&quot;,&quot;Effect&quot;: &quot;Allow&quot;,&quot;Resource&quot;: &quot;</em>&quot;}],&quot;Version&quot;: &quot;1&quot;}</p>
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
