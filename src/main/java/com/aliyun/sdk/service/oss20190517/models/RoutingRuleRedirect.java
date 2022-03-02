// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link RoutingRuleRedirect} extends {@link TeaModel}
 *
 * <p>RoutingRuleRedirect</p>
 */
public class RoutingRuleRedirect extends TeaModel {
    @NameInMap("EnableReplacePrefix")
    private Boolean enableReplacePrefix;

    @NameInMap("HostName")
    private String hostName;

    @NameInMap("HttpRedirectCode")
    private Long httpRedirectCode;

    @NameInMap("MirrorCheckMd5")
    private Boolean mirrorCheckMd5;

    @NameInMap("MirrorFollowRedirect")
    private Boolean mirrorFollowRedirect;

    @NameInMap("MirrorHeaders")
    private MirrorHeaders mirrorHeaders;

    @NameInMap("MirrorPassQueryString")
    private Boolean mirrorPassQueryString;

    @NameInMap("MirrorURL")
    private String mirrorURL;

    @NameInMap("PassQueryString")
    private Boolean passQueryString;

    @NameInMap("Protocol")
    private String protocol;

    @NameInMap("RedirectType")
    private String redirectType;

    @NameInMap("ReplaceKeyPrefixWith")
    private String replaceKeyPrefixWith;

    @NameInMap("ReplaceKeyWith")
    private String replaceKeyWith;

    @NameInMap("TransparentMirrorResponseCodes")
    private String transparentMirrorResponseCodes;

    private RoutingRuleRedirect(Builder builder) {
        this.enableReplacePrefix = builder.enableReplacePrefix;
        this.hostName = builder.hostName;
        this.httpRedirectCode = builder.httpRedirectCode;
        this.mirrorCheckMd5 = builder.mirrorCheckMd5;
        this.mirrorFollowRedirect = builder.mirrorFollowRedirect;
        this.mirrorHeaders = builder.mirrorHeaders;
        this.mirrorPassQueryString = builder.mirrorPassQueryString;
        this.mirrorURL = builder.mirrorURL;
        this.passQueryString = builder.passQueryString;
        this.protocol = builder.protocol;
        this.redirectType = builder.redirectType;
        this.replaceKeyPrefixWith = builder.replaceKeyPrefixWith;
        this.replaceKeyWith = builder.replaceKeyWith;
        this.transparentMirrorResponseCodes = builder.transparentMirrorResponseCodes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RoutingRuleRedirect create() {
        return builder().build();
    }

    /**
     * @return enableReplacePrefix
     */
    public Boolean getEnableReplacePrefix() {
        return this.enableReplacePrefix;
    }

    /**
     * @return hostName
     */
    public String getHostName() {
        return this.hostName;
    }

    /**
     * @return httpRedirectCode
     */
    public Long getHttpRedirectCode() {
        return this.httpRedirectCode;
    }

    /**
     * @return mirrorCheckMd5
     */
    public Boolean getMirrorCheckMd5() {
        return this.mirrorCheckMd5;
    }

    /**
     * @return mirrorFollowRedirect
     */
    public Boolean getMirrorFollowRedirect() {
        return this.mirrorFollowRedirect;
    }

    /**
     * @return mirrorHeaders
     */
    public MirrorHeaders getMirrorHeaders() {
        return this.mirrorHeaders;
    }

    /**
     * @return mirrorPassQueryString
     */
    public Boolean getMirrorPassQueryString() {
        return this.mirrorPassQueryString;
    }

    /**
     * @return mirrorURL
     */
    public String getMirrorURL() {
        return this.mirrorURL;
    }

    /**
     * @return passQueryString
     */
    public Boolean getPassQueryString() {
        return this.passQueryString;
    }

    /**
     * @return protocol
     */
    public String getProtocol() {
        return this.protocol;
    }

    /**
     * @return redirectType
     */
    public String getRedirectType() {
        return this.redirectType;
    }

    /**
     * @return replaceKeyPrefixWith
     */
    public String getReplaceKeyPrefixWith() {
        return this.replaceKeyPrefixWith;
    }

    /**
     * @return replaceKeyWith
     */
    public String getReplaceKeyWith() {
        return this.replaceKeyWith;
    }

    /**
     * @return transparentMirrorResponseCodes
     */
    public String getTransparentMirrorResponseCodes() {
        return this.transparentMirrorResponseCodes;
    }

    public static final class Builder {
        private Boolean enableReplacePrefix; 
        private String hostName; 
        private Long httpRedirectCode; 
        private Boolean mirrorCheckMd5; 
        private Boolean mirrorFollowRedirect; 
        private MirrorHeaders mirrorHeaders; 
        private Boolean mirrorPassQueryString; 
        private String mirrorURL; 
        private Boolean passQueryString; 
        private String protocol; 
        private String redirectType; 
        private String replaceKeyPrefixWith; 
        private String replaceKeyWith; 
        private String transparentMirrorResponseCodes; 

        /**
         * description
         */
        public Builder enableReplacePrefix(Boolean enableReplacePrefix) {
            this.enableReplacePrefix = enableReplacePrefix;
            return this;
        }

        /**
         * description
         */
        public Builder hostName(String hostName) {
            this.hostName = hostName;
            return this;
        }

        /**
         * description
         */
        public Builder httpRedirectCode(Long httpRedirectCode) {
            this.httpRedirectCode = httpRedirectCode;
            return this;
        }

        /**
         * description
         */
        public Builder mirrorCheckMd5(Boolean mirrorCheckMd5) {
            this.mirrorCheckMd5 = mirrorCheckMd5;
            return this;
        }

        /**
         * description
         */
        public Builder mirrorFollowRedirect(Boolean mirrorFollowRedirect) {
            this.mirrorFollowRedirect = mirrorFollowRedirect;
            return this;
        }

        /**
         * description
         */
        public Builder mirrorHeaders(MirrorHeaders mirrorHeaders) {
            this.mirrorHeaders = mirrorHeaders;
            return this;
        }

        /**
         * description
         */
        public Builder mirrorPassQueryString(Boolean mirrorPassQueryString) {
            this.mirrorPassQueryString = mirrorPassQueryString;
            return this;
        }

        /**
         * description
         */
        public Builder mirrorURL(String mirrorURL) {
            this.mirrorURL = mirrorURL;
            return this;
        }

        /**
         * description
         */
        public Builder passQueryString(Boolean passQueryString) {
            this.passQueryString = passQueryString;
            return this;
        }

        /**
         * description
         */
        public Builder protocol(String protocol) {
            this.protocol = protocol;
            return this;
        }

        /**
         * description
         */
        public Builder redirectType(String redirectType) {
            this.redirectType = redirectType;
            return this;
        }

        /**
         * description
         */
        public Builder replaceKeyPrefixWith(String replaceKeyPrefixWith) {
            this.replaceKeyPrefixWith = replaceKeyPrefixWith;
            return this;
        }

        /**
         * description
         */
        public Builder replaceKeyWith(String replaceKeyWith) {
            this.replaceKeyWith = replaceKeyWith;
            return this;
        }

        /**
         * description
         */
        public Builder transparentMirrorResponseCodes(String transparentMirrorResponseCodes) {
            this.transparentMirrorResponseCodes = transparentMirrorResponseCodes;
            return this;
        }

        public RoutingRuleRedirect build() {
            return new RoutingRuleRedirect(this);
        } 

    } 

    public static class Set extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Set(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Set create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * description
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * description
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Set build() {
                return new Set(this);
            } 

        } 

    }
    public static class MirrorHeaders extends TeaModel {
        @NameInMap("Pass")
        private java.util.List < String > pass;

        @NameInMap("PassAll")
        private Boolean passAll;

        @NameInMap("Remove")
        private java.util.List < String > remove;

        @NameInMap("Set")
        private java.util.List < Set> set;

        private MirrorHeaders(Builder builder) {
            this.pass = builder.pass;
            this.passAll = builder.passAll;
            this.remove = builder.remove;
            this.set = builder.set;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MirrorHeaders create() {
            return builder().build();
        }

        /**
         * @return pass
         */
        public java.util.List < String > getPass() {
            return this.pass;
        }

        /**
         * @return passAll
         */
        public Boolean getPassAll() {
            return this.passAll;
        }

        /**
         * @return remove
         */
        public java.util.List < String > getRemove() {
            return this.remove;
        }

        /**
         * @return set
         */
        public java.util.List < Set> getSet() {
            return this.set;
        }

        public static final class Builder {
            private java.util.List < String > pass; 
            private Boolean passAll; 
            private java.util.List < String > remove; 
            private java.util.List < Set> set; 

            /**
             * description
             */
            public Builder pass(java.util.List < String > pass) {
                this.pass = pass;
                return this;
            }

            /**
             * description
             */
            public Builder passAll(Boolean passAll) {
                this.passAll = passAll;
                return this;
            }

            /**
             * description
             */
            public Builder remove(java.util.List < String > remove) {
                this.remove = remove;
                return this;
            }

            /**
             * description
             */
            public Builder set(java.util.List < Set> set) {
                this.set = set;
                return this;
            }

            public MirrorHeaders build() {
                return new MirrorHeaders(this);
            } 

        } 

    }
}
