// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.riskmanagement20260424.models;

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
 * {@link UpdatePostPaidBindRelRequest} extends {@link RequestModel}
 *
 * <p>UpdatePostPaidBindRelRequest</p>
 */
public class UpdatePostPaidBindRelRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SdkRequest")
    private SdkRequest sdkRequest;

    private UpdatePostPaidBindRelRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.sdkRequest = builder.sdkRequest;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdatePostPaidBindRelRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return sdkRequest
     */
    public SdkRequest getSdkRequest() {
        return this.sdkRequest;
    }

    public static final class Builder extends Request.Builder<UpdatePostPaidBindRelRequest, Builder> {
        private String regionId; 
        private SdkRequest sdkRequest; 

        private Builder() {
            super();
        } 

        private Builder(UpdatePostPaidBindRelRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.sdkRequest = request.sdkRequest;
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
         * SdkRequest.
         */
        public Builder sdkRequest(SdkRequest sdkRequest) {
            String sdkRequestShrink = shrink(sdkRequest, "SdkRequest", "json");
            this.putQueryParameter("SdkRequest", sdkRequestShrink);
            this.sdkRequest = sdkRequest;
            return this;
        }

        @Override
        public UpdatePostPaidBindRelRequest build() {
            return new UpdatePostPaidBindRelRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdatePostPaidBindRelRequest} extends {@link TeaModel}
     *
     * <p>UpdatePostPaidBindRelRequest</p>
     */
    public static class BindAction extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BindAll")
        private Boolean bindAll;

        @com.aliyun.core.annotation.NameInMap("UuidList")
        private java.util.List<String> uuidList;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private BindAction(Builder builder) {
            this.bindAll = builder.bindAll;
            this.uuidList = builder.uuidList;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BindAction create() {
            return builder().build();
        }

        /**
         * @return bindAll
         */
        public Boolean getBindAll() {
            return this.bindAll;
        }

        /**
         * @return uuidList
         */
        public java.util.List<String> getUuidList() {
            return this.uuidList;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private Boolean bindAll; 
            private java.util.List<String> uuidList; 
            private String version; 

            private Builder() {
            } 

            private Builder(BindAction model) {
                this.bindAll = model.bindAll;
                this.uuidList = model.uuidList;
                this.version = model.version;
            } 

            /**
             * BindAll.
             */
            public Builder bindAll(Boolean bindAll) {
                this.bindAll = bindAll;
                return this;
            }

            /**
             * UuidList.
             */
            public Builder uuidList(java.util.List<String> uuidList) {
                this.uuidList = uuidList;
                return this;
            }

            /**
             * Version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public BindAction build() {
                return new BindAction(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdatePostPaidBindRelRequest} extends {@link TeaModel}
     *
     * <p>UpdatePostPaidBindRelRequest</p>
     */
    public static class SdkRequest extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoBind")
        private Integer autoBind;

        @com.aliyun.core.annotation.NameInMap("AutoBindVersion")
        private Integer autoBindVersion;

        @com.aliyun.core.annotation.NameInMap("BindAction")
        private java.util.List<BindAction> bindAction;

        @com.aliyun.core.annotation.NameInMap("UpdateIfNecessary")
        private Boolean updateIfNecessary;

        private SdkRequest(Builder builder) {
            this.autoBind = builder.autoBind;
            this.autoBindVersion = builder.autoBindVersion;
            this.bindAction = builder.bindAction;
            this.updateIfNecessary = builder.updateIfNecessary;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SdkRequest create() {
            return builder().build();
        }

        /**
         * @return autoBind
         */
        public Integer getAutoBind() {
            return this.autoBind;
        }

        /**
         * @return autoBindVersion
         */
        public Integer getAutoBindVersion() {
            return this.autoBindVersion;
        }

        /**
         * @return bindAction
         */
        public java.util.List<BindAction> getBindAction() {
            return this.bindAction;
        }

        /**
         * @return updateIfNecessary
         */
        public Boolean getUpdateIfNecessary() {
            return this.updateIfNecessary;
        }

        public static final class Builder {
            private Integer autoBind; 
            private Integer autoBindVersion; 
            private java.util.List<BindAction> bindAction; 
            private Boolean updateIfNecessary; 

            private Builder() {
            } 

            private Builder(SdkRequest model) {
                this.autoBind = model.autoBind;
                this.autoBindVersion = model.autoBindVersion;
                this.bindAction = model.bindAction;
                this.updateIfNecessary = model.updateIfNecessary;
            } 

            /**
             * AutoBind.
             */
            public Builder autoBind(Integer autoBind) {
                this.autoBind = autoBind;
                return this;
            }

            /**
             * AutoBindVersion.
             */
            public Builder autoBindVersion(Integer autoBindVersion) {
                this.autoBindVersion = autoBindVersion;
                return this;
            }

            /**
             * BindAction.
             */
            public Builder bindAction(java.util.List<BindAction> bindAction) {
                this.bindAction = bindAction;
                return this;
            }

            /**
             * UpdateIfNecessary.
             */
            public Builder updateIfNecessary(Boolean updateIfNecessary) {
                this.updateIfNecessary = updateIfNecessary;
                return this;
            }

            public SdkRequest build() {
                return new SdkRequest(this);
            } 

        } 

    }
}
