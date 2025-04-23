// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

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
 * {@link SetPostScriptsRequest} extends {@link RequestModel}
 *
 * <p>SetPostScriptsRequest</p>
 */
public class SetPostScriptsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PostInstallScripts")
    private java.util.List<PostInstallScripts> postInstallScripts;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private SetPostScriptsRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.postInstallScripts = builder.postInstallScripts;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetPostScriptsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return postInstallScripts
     */
    public java.util.List<PostInstallScripts> getPostInstallScripts() {
        return this.postInstallScripts;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<SetPostScriptsRequest, Builder> {
        private String clusterId; 
        private java.util.List<PostInstallScripts> postInstallScripts; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(SetPostScriptsRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.postInstallScripts = request.postInstallScripts;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The cluster ID.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/87116.html">ListClusters</a> operation to obtain the cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ehpc-sh-EnjshUxn</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The post-processing scripts.</p>
         */
        public Builder postInstallScripts(java.util.List<PostInstallScripts> postInstallScripts) {
            this.putQueryParameter("PostInstallScripts", postInstallScripts);
            this.postInstallScripts = postInstallScripts;
            return this;
        }

        /**
         * <p>The ID of the region where the cluster resides. You can call the <a href="https://help.aliyun.com/document_detail/188593.html">ListRegions</a> operation to query the latest region list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public SetPostScriptsRequest build() {
            return new SetPostScriptsRequest(this);
        } 

    } 

    /**
     * 
     * {@link SetPostScriptsRequest} extends {@link TeaModel}
     *
     * <p>SetPostScriptsRequest</p>
     */
    public static class PostInstallScripts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Args")
        private String args;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private PostInstallScripts(Builder builder) {
            this.args = builder.args;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PostInstallScripts create() {
            return builder().build();
        }

        /**
         * @return args
         */
        public String getArgs() {
            return this.args;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String args; 
            private String url; 

            private Builder() {
            } 

            private Builder(PostInstallScripts model) {
                this.args = model.args;
                this.url = model.url;
            } 

            /**
             * <p>The parameter that is used to run the post-processing script.</p>
             * 
             * <strong>example:</strong>
             * <p>-h</p>
             */
            public Builder args(String args) {
                this.args = args;
                return this;
            }

            /**
             * <p>The URL that is used to download the post-processing script.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://bucket.oss-cn-shanghai.aliyuncs.com/postscript_examples.sh">https://bucket.oss-cn-shanghai.aliyuncs.com/postscript_examples.sh</a></p>
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public PostInstallScripts build() {
                return new PostInstallScripts(this);
            } 

        } 

    }
}
