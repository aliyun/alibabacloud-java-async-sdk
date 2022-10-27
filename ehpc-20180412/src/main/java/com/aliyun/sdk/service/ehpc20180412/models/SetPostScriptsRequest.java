// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetPostScriptsRequest} extends {@link RequestModel}
 *
 * <p>SetPostScriptsRequest</p>
 */
public class SetPostScriptsRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("PostInstallScripts")
    private java.util.List < PostInstallScripts> postInstallScripts;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
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
    public java.util.List < PostInstallScripts> getPostInstallScripts() {
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
        private java.util.List < PostInstallScripts> postInstallScripts; 
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
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * PostInstallScripts.
         */
        public Builder postInstallScripts(java.util.List < PostInstallScripts> postInstallScripts) {
            this.putQueryParameter("PostInstallScripts", postInstallScripts);
            this.postInstallScripts = postInstallScripts;
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

        @Override
        public SetPostScriptsRequest build() {
            return new SetPostScriptsRequest(this);
        } 

    } 

    public static class PostInstallScripts extends TeaModel {
        @NameInMap("Args")
        private String args;

        @NameInMap("Url")
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

            /**
             * Args.
             */
            public Builder args(String args) {
                this.args = args;
                return this;
            }

            /**
             * Url.
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
