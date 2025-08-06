// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link DataBusinessesValue} extends {@link TeaModel}
 *
 * <p>DataBusinessesValue</p>
 */
public class DataBusinessesValue extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Id")
    private Integer id;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("Cname")
    private String cname;

    @com.aliyun.core.annotation.NameInMap("Sname")
    private String sname;

    @com.aliyun.core.annotation.NameInMap("SdkCodes")
    private java.util.List<SdkCodes> sdkCodes;

    @com.aliyun.core.annotation.NameInMap("SdkFeatures")
    private java.util.List<SdkFeatures> sdkFeatures;

    @com.aliyun.core.annotation.NameInMap("Version")
    private String version;

    @com.aliyun.core.annotation.NameInMap("IceOpen")
    private Integer iceOpen;

    @com.aliyun.core.annotation.NameInMap("SupportPlatform")
    private Integer supportPlatform;

    @com.aliyun.core.annotation.NameInMap("FunctionDesc")
    private String functionDesc;

    @com.aliyun.core.annotation.NameInMap("ProductDesc")
    private String productDesc;

    @com.aliyun.core.annotation.NameInMap("Size")
    private String size;

    @com.aliyun.core.annotation.NameInMap("Authorized")
    private Integer authorized;

    @com.aliyun.core.annotation.NameInMap("AuthorizedApp")
    private java.util.List<String> authorizedApp;

    private DataBusinessesValue(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.cname = builder.cname;
        this.sname = builder.sname;
        this.sdkCodes = builder.sdkCodes;
        this.sdkFeatures = builder.sdkFeatures;
        this.version = builder.version;
        this.iceOpen = builder.iceOpen;
        this.supportPlatform = builder.supportPlatform;
        this.functionDesc = builder.functionDesc;
        this.productDesc = builder.productDesc;
        this.size = builder.size;
        this.authorized = builder.authorized;
        this.authorizedApp = builder.authorizedApp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DataBusinessesValue create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return cname
     */
    public String getCname() {
        return this.cname;
    }

    /**
     * @return sname
     */
    public String getSname() {
        return this.sname;
    }

    /**
     * @return sdkCodes
     */
    public java.util.List<SdkCodes> getSdkCodes() {
        return this.sdkCodes;
    }

    /**
     * @return sdkFeatures
     */
    public java.util.List<SdkFeatures> getSdkFeatures() {
        return this.sdkFeatures;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    /**
     * @return iceOpen
     */
    public Integer getIceOpen() {
        return this.iceOpen;
    }

    /**
     * @return supportPlatform
     */
    public Integer getSupportPlatform() {
        return this.supportPlatform;
    }

    /**
     * @return functionDesc
     */
    public String getFunctionDesc() {
        return this.functionDesc;
    }

    /**
     * @return productDesc
     */
    public String getProductDesc() {
        return this.productDesc;
    }

    /**
     * @return size
     */
    public String getSize() {
        return this.size;
    }

    /**
     * @return authorized
     */
    public Integer getAuthorized() {
        return this.authorized;
    }

    /**
     * @return authorizedApp
     */
    public java.util.List<String> getAuthorizedApp() {
        return this.authorizedApp;
    }

    public static final class Builder {
        private Integer id; 
        private String name; 
        private String cname; 
        private String sname; 
        private java.util.List<SdkCodes> sdkCodes; 
        private java.util.List<SdkFeatures> sdkFeatures; 
        private String version; 
        private Integer iceOpen; 
        private Integer supportPlatform; 
        private String functionDesc; 
        private String productDesc; 
        private String size; 
        private Integer authorized; 
        private java.util.List<String> authorizedApp; 

        private Builder() {
        } 

        private Builder(DataBusinessesValue model) {
            this.id = model.id;
            this.name = model.name;
            this.cname = model.cname;
            this.sname = model.sname;
            this.sdkCodes = model.sdkCodes;
            this.sdkFeatures = model.sdkFeatures;
            this.version = model.version;
            this.iceOpen = model.iceOpen;
            this.supportPlatform = model.supportPlatform;
            this.functionDesc = model.functionDesc;
            this.productDesc = model.productDesc;
            this.size = model.size;
            this.authorized = model.authorized;
            this.authorizedApp = model.authorizedApp;
        } 

        /**
         * Id.
         */
        public Builder id(Integer id) {
            this.id = id;
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
         * Cname.
         */
        public Builder cname(String cname) {
            this.cname = cname;
            return this;
        }

        /**
         * Sname.
         */
        public Builder sname(String sname) {
            this.sname = sname;
            return this;
        }

        /**
         * SdkCodes.
         */
        public Builder sdkCodes(java.util.List<SdkCodes> sdkCodes) {
            this.sdkCodes = sdkCodes;
            return this;
        }

        /**
         * SdkFeatures.
         */
        public Builder sdkFeatures(java.util.List<SdkFeatures> sdkFeatures) {
            this.sdkFeatures = sdkFeatures;
            return this;
        }

        /**
         * Version.
         */
        public Builder version(String version) {
            this.version = version;
            return this;
        }

        /**
         * IceOpen.
         */
        public Builder iceOpen(Integer iceOpen) {
            this.iceOpen = iceOpen;
            return this;
        }

        /**
         * SupportPlatform.
         */
        public Builder supportPlatform(Integer supportPlatform) {
            this.supportPlatform = supportPlatform;
            return this;
        }

        /**
         * FunctionDesc.
         */
        public Builder functionDesc(String functionDesc) {
            this.functionDesc = functionDesc;
            return this;
        }

        /**
         * ProductDesc.
         */
        public Builder productDesc(String productDesc) {
            this.productDesc = productDesc;
            return this;
        }

        /**
         * Size.
         */
        public Builder size(String size) {
            this.size = size;
            return this;
        }

        /**
         * Authorized.
         */
        public Builder authorized(Integer authorized) {
            this.authorized = authorized;
            return this;
        }

        /**
         * AuthorizedApp.
         */
        public Builder authorizedApp(java.util.List<String> authorizedApp) {
            this.authorizedApp = authorizedApp;
            return this;
        }

        public DataBusinessesValue build() {
            return new DataBusinessesValue(this);
        } 

    } 

    /**
     * 
     * {@link DataBusinessesValue} extends {@link TeaModel}
     *
     * <p>DataBusinessesValue</p>
     */
    public static class Integrate extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Platform")
        private String platform;

        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Pkg")
        private String pkg;

        @com.aliyun.core.annotation.NameInMap("Size")
        private String size;

        private Integrate(Builder builder) {
            this.platform = builder.platform;
            this.code = builder.code;
            this.pkg = builder.pkg;
            this.size = builder.size;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Integrate create() {
            return builder().build();
        }

        /**
         * @return platform
         */
        public String getPlatform() {
            return this.platform;
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return pkg
         */
        public String getPkg() {
            return this.pkg;
        }

        /**
         * @return size
         */
        public String getSize() {
            return this.size;
        }

        public static final class Builder {
            private String platform; 
            private String code; 
            private String pkg; 
            private String size; 

            private Builder() {
            } 

            private Builder(Integrate model) {
                this.platform = model.platform;
                this.code = model.code;
                this.pkg = model.pkg;
                this.size = model.size;
            } 

            /**
             * Platform.
             */
            public Builder platform(String platform) {
                this.platform = platform;
                return this;
            }

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * Pkg.
             */
            public Builder pkg(String pkg) {
                this.pkg = pkg;
                return this;
            }

            /**
             * Size.
             */
            public Builder size(String size) {
                this.size = size;
                return this;
            }

            public Integrate build() {
                return new Integrate(this);
            } 

        } 

    }
    /**
     * 
     * {@link DataBusinessesValue} extends {@link TeaModel}
     *
     * <p>DataBusinessesValue</p>
     */
    public static class SdkCodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private Integer id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("SellPrice")
        private String sellPrice;

        @com.aliyun.core.annotation.NameInMap("IceOpen")
        private Integer iceOpen;

        @com.aliyun.core.annotation.NameInMap("SupportPlatform")
        private Integer supportPlatform;

        @com.aliyun.core.annotation.NameInMap("Size")
        private String size;

        @com.aliyun.core.annotation.NameInMap("Authorized")
        private Integer authorized;

        @com.aliyun.core.annotation.NameInMap("AuthorizedApp")
        private java.util.List<String> authorizedApp;

        @com.aliyun.core.annotation.NameInMap("DefaultFeature")
        private String defaultFeature;

        @com.aliyun.core.annotation.NameInMap("Integrate")
        private java.util.List<Integrate> integrate;

        @com.aliyun.core.annotation.NameInMap("Subscription")
        private String subscription;

        @com.aliyun.core.annotation.NameInMap("ProductDesc")
        private String productDesc;

        @com.aliyun.core.annotation.NameInMap("SubscriptionPkg")
        private String subscriptionPkg;

        @com.aliyun.core.annotation.NameInMap("SubscriptionImp")
        private String subscriptionImp;

        private SdkCodes(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
            this.sellPrice = builder.sellPrice;
            this.iceOpen = builder.iceOpen;
            this.supportPlatform = builder.supportPlatform;
            this.size = builder.size;
            this.authorized = builder.authorized;
            this.authorizedApp = builder.authorizedApp;
            this.defaultFeature = builder.defaultFeature;
            this.integrate = builder.integrate;
            this.subscription = builder.subscription;
            this.productDesc = builder.productDesc;
            this.subscriptionPkg = builder.subscriptionPkg;
            this.subscriptionImp = builder.subscriptionImp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SdkCodes create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public Integer getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return sellPrice
         */
        public String getSellPrice() {
            return this.sellPrice;
        }

        /**
         * @return iceOpen
         */
        public Integer getIceOpen() {
            return this.iceOpen;
        }

        /**
         * @return supportPlatform
         */
        public Integer getSupportPlatform() {
            return this.supportPlatform;
        }

        /**
         * @return size
         */
        public String getSize() {
            return this.size;
        }

        /**
         * @return authorized
         */
        public Integer getAuthorized() {
            return this.authorized;
        }

        /**
         * @return authorizedApp
         */
        public java.util.List<String> getAuthorizedApp() {
            return this.authorizedApp;
        }

        /**
         * @return defaultFeature
         */
        public String getDefaultFeature() {
            return this.defaultFeature;
        }

        /**
         * @return integrate
         */
        public java.util.List<Integrate> getIntegrate() {
            return this.integrate;
        }

        /**
         * @return subscription
         */
        public String getSubscription() {
            return this.subscription;
        }

        /**
         * @return productDesc
         */
        public String getProductDesc() {
            return this.productDesc;
        }

        /**
         * @return subscriptionPkg
         */
        public String getSubscriptionPkg() {
            return this.subscriptionPkg;
        }

        /**
         * @return subscriptionImp
         */
        public String getSubscriptionImp() {
            return this.subscriptionImp;
        }

        public static final class Builder {
            private Integer id; 
            private String name; 
            private String sellPrice; 
            private Integer iceOpen; 
            private Integer supportPlatform; 
            private String size; 
            private Integer authorized; 
            private java.util.List<String> authorizedApp; 
            private String defaultFeature; 
            private java.util.List<Integrate> integrate; 
            private String subscription; 
            private String productDesc; 
            private String subscriptionPkg; 
            private String subscriptionImp; 

            private Builder() {
            } 

            private Builder(SdkCodes model) {
                this.id = model.id;
                this.name = model.name;
                this.sellPrice = model.sellPrice;
                this.iceOpen = model.iceOpen;
                this.supportPlatform = model.supportPlatform;
                this.size = model.size;
                this.authorized = model.authorized;
                this.authorizedApp = model.authorizedApp;
                this.defaultFeature = model.defaultFeature;
                this.integrate = model.integrate;
                this.subscription = model.subscription;
                this.productDesc = model.productDesc;
                this.subscriptionPkg = model.subscriptionPkg;
                this.subscriptionImp = model.subscriptionImp;
            } 

            /**
             * Id.
             */
            public Builder id(Integer id) {
                this.id = id;
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
             * SellPrice.
             */
            public Builder sellPrice(String sellPrice) {
                this.sellPrice = sellPrice;
                return this;
            }

            /**
             * IceOpen.
             */
            public Builder iceOpen(Integer iceOpen) {
                this.iceOpen = iceOpen;
                return this;
            }

            /**
             * SupportPlatform.
             */
            public Builder supportPlatform(Integer supportPlatform) {
                this.supportPlatform = supportPlatform;
                return this;
            }

            /**
             * Size.
             */
            public Builder size(String size) {
                this.size = size;
                return this;
            }

            /**
             * Authorized.
             */
            public Builder authorized(Integer authorized) {
                this.authorized = authorized;
                return this;
            }

            /**
             * AuthorizedApp.
             */
            public Builder authorizedApp(java.util.List<String> authorizedApp) {
                this.authorizedApp = authorizedApp;
                return this;
            }

            /**
             * DefaultFeature.
             */
            public Builder defaultFeature(String defaultFeature) {
                this.defaultFeature = defaultFeature;
                return this;
            }

            /**
             * Integrate.
             */
            public Builder integrate(java.util.List<Integrate> integrate) {
                this.integrate = integrate;
                return this;
            }

            /**
             * Subscription.
             */
            public Builder subscription(String subscription) {
                this.subscription = subscription;
                return this;
            }

            /**
             * ProductDesc.
             */
            public Builder productDesc(String productDesc) {
                this.productDesc = productDesc;
                return this;
            }

            /**
             * SubscriptionPkg.
             */
            public Builder subscriptionPkg(String subscriptionPkg) {
                this.subscriptionPkg = subscriptionPkg;
                return this;
            }

            /**
             * SubscriptionImp.
             */
            public Builder subscriptionImp(String subscriptionImp) {
                this.subscriptionImp = subscriptionImp;
                return this;
            }

            public SdkCodes build() {
                return new SdkCodes(this);
            } 

        } 

    }
    /**
     * 
     * {@link DataBusinessesValue} extends {@link TeaModel}
     *
     * <p>DataBusinessesValue</p>
     */
    public static class SdkFeatures extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private Integer id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Scode")
        private String scode;

        @com.aliyun.core.annotation.NameInMap("Svalue")
        private String svalue;

        private SdkFeatures(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
            this.scode = builder.scode;
            this.svalue = builder.svalue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SdkFeatures create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public Integer getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return scode
         */
        public String getScode() {
            return this.scode;
        }

        /**
         * @return svalue
         */
        public String getSvalue() {
            return this.svalue;
        }

        public static final class Builder {
            private Integer id; 
            private String name; 
            private String scode; 
            private String svalue; 

            private Builder() {
            } 

            private Builder(SdkFeatures model) {
                this.id = model.id;
                this.name = model.name;
                this.scode = model.scode;
                this.svalue = model.svalue;
            } 

            /**
             * Id.
             */
            public Builder id(Integer id) {
                this.id = id;
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
             * Scode.
             */
            public Builder scode(String scode) {
                this.scode = scode;
                return this;
            }

            /**
             * Svalue.
             */
            public Builder svalue(String svalue) {
                this.svalue = svalue;
                return this;
            }

            public SdkFeatures build() {
                return new SdkFeatures(this);
            } 

        } 

    }
}
