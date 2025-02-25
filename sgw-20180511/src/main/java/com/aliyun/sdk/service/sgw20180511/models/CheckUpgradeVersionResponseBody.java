// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckUpgradeVersionResponseBody} extends {@link TeaModel}
 *
 * <p>CheckUpgradeVersionResponseBody</p>
 */
public class CheckUpgradeVersionResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("LatestVersion")
    private String latestVersion;

    @NameInMap("Message")
    private String message;

    @NameInMap("Option")
    private String option;

    @NameInMap("Patches")
    private Patches patches;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private CheckUpgradeVersionResponseBody(Builder builder) {
        this.code = builder.code;
        this.latestVersion = builder.latestVersion;
        this.message = builder.message;
        this.option = builder.option;
        this.patches = builder.patches;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckUpgradeVersionResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return latestVersion
     */
    public String getLatestVersion() {
        return this.latestVersion;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return option
     */
    public String getOption() {
        return this.option;
    }

    /**
     * @return patches
     */
    public Patches getPatches() {
        return this.patches;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private String latestVersion; 
        private String message; 
        private String option; 
        private Patches patches; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * LatestVersion.
         */
        public Builder latestVersion(String latestVersion) {
            this.latestVersion = latestVersion;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Option.
         */
        public Builder option(String option) {
            this.option = option;
            return this;
        }

        /**
         * Patches.
         */
        public Builder patches(Patches patches) {
            this.patches = patches;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CheckUpgradeVersionResponseBody build() {
            return new CheckUpgradeVersionResponseBody(this);
        } 

    } 

    public static class Patch extends TeaModel {
        @NameInMap("InternalUrl")
        private String internalUrl;

        @NameInMap("MD5")
        private String mD5;

        @NameInMap("Name")
        private String name;

        @NameInMap("Url")
        private String url;

        private Patch(Builder builder) {
            this.internalUrl = builder.internalUrl;
            this.mD5 = builder.mD5;
            this.name = builder.name;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Patch create() {
            return builder().build();
        }

        /**
         * @return internalUrl
         */
        public String getInternalUrl() {
            return this.internalUrl;
        }

        /**
         * @return mD5
         */
        public String getMD5() {
            return this.mD5;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String internalUrl; 
            private String mD5; 
            private String name; 
            private String url; 

            /**
             * InternalUrl.
             */
            public Builder internalUrl(String internalUrl) {
                this.internalUrl = internalUrl;
                return this;
            }

            /**
             * MD5.
             */
            public Builder mD5(String mD5) {
                this.mD5 = mD5;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public Patch build() {
                return new Patch(this);
            } 

        } 

    }
    public static class Patches extends TeaModel {
        @NameInMap("Patch")
        private java.util.List < Patch> patch;

        private Patches(Builder builder) {
            this.patch = builder.patch;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Patches create() {
            return builder().build();
        }

        /**
         * @return patch
         */
        public java.util.List < Patch> getPatch() {
            return this.patch;
        }

        public static final class Builder {
            private java.util.List < Patch> patch; 

            /**
             * Patch.
             */
            public Builder patch(java.util.List < Patch> patch) {
                this.patch = patch;
                return this;
            }

            public Patches build() {
                return new Patches(this);
            } 

        } 

    }
}
