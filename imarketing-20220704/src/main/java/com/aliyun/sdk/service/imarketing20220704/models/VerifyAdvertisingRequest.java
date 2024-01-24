// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imarketing20220704.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link VerifyAdvertisingRequest} extends {@link RequestModel}
 *
 * <p>VerifyAdvertisingRequest</p>
 */
public class VerifyAdvertisingRequest extends Request {
    @Query
    @NameInMap("App")
    private App app;

    @Query
    @NameInMap("Dealtype")
    private Integer dealtype;

    @Query
    @NameInMap("Device")
    private Device device;

    @Query
    @NameInMap("Ext")
    private java.util.Map < String, ? > ext;

    @Query
    @NameInMap("Id")
    private String id;

    @Query
    @NameInMap("Imp")
    private java.util.List < Imp> imp;

    @Query
    @NameInMap("Test")
    private Integer test;

    @Query
    @NameInMap("User")
    private User user;

    @Query
    @NameInMap("Verifyad")
    private java.util.List < Verifyad> verifyad;

    private VerifyAdvertisingRequest(Builder builder) {
        super(builder);
        this.app = builder.app;
        this.dealtype = builder.dealtype;
        this.device = builder.device;
        this.ext = builder.ext;
        this.id = builder.id;
        this.imp = builder.imp;
        this.test = builder.test;
        this.user = builder.user;
        this.verifyad = builder.verifyad;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VerifyAdvertisingRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return app
     */
    public App getApp() {
        return this.app;
    }

    /**
     * @return dealtype
     */
    public Integer getDealtype() {
        return this.dealtype;
    }

    /**
     * @return device
     */
    public Device getDevice() {
        return this.device;
    }

    /**
     * @return ext
     */
    public java.util.Map < String, ? > getExt() {
        return this.ext;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return imp
     */
    public java.util.List < Imp> getImp() {
        return this.imp;
    }

    /**
     * @return test
     */
    public Integer getTest() {
        return this.test;
    }

    /**
     * @return user
     */
    public User getUser() {
        return this.user;
    }

    /**
     * @return verifyad
     */
    public java.util.List < Verifyad> getVerifyad() {
        return this.verifyad;
    }

    public static final class Builder extends Request.Builder<VerifyAdvertisingRequest, Builder> {
        private App app; 
        private Integer dealtype; 
        private Device device; 
        private java.util.Map < String, ? > ext; 
        private String id; 
        private java.util.List < Imp> imp; 
        private Integer test; 
        private User user; 
        private java.util.List < Verifyad> verifyad; 

        private Builder() {
            super();
        } 

        private Builder(VerifyAdvertisingRequest request) {
            super(request);
            this.app = request.app;
            this.dealtype = request.dealtype;
            this.device = request.device;
            this.ext = request.ext;
            this.id = request.id;
            this.imp = request.imp;
            this.test = request.test;
            this.user = request.user;
            this.verifyad = request.verifyad;
        } 

        /**
         * app
         */
        public Builder app(App app) {
            String appShrink = shrink(app, "App", "json");
            this.putQueryParameter("App", appShrink);
            this.app = app;
            return this;
        }

        /**
         * Dealtype.
         */
        public Builder dealtype(Integer dealtype) {
            this.putQueryParameter("Dealtype", dealtype);
            this.dealtype = dealtype;
            return this;
        }

        /**
         * device
         */
        public Builder device(Device device) {
            String deviceShrink = shrink(device, "Device", "json");
            this.putQueryParameter("Device", deviceShrink);
            this.device = device;
            return this;
        }

        /**
         * ext
         */
        public Builder ext(java.util.Map < String, ? > ext) {
            String extShrink = shrink(ext, "Ext", "json");
            this.putQueryParameter("Ext", extShrink);
            this.ext = ext;
            return this;
        }

        /**
         * id
         */
        public Builder id(String id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * imp
         */
        public Builder imp(java.util.List < Imp> imp) {
            String impShrink = shrink(imp, "Imp", "json");
            this.putQueryParameter("Imp", impShrink);
            this.imp = imp;
            return this;
        }

        /**
         * test
         */
        public Builder test(Integer test) {
            this.putQueryParameter("Test", test);
            this.test = test;
            return this;
        }

        /**
         * user
         */
        public Builder user(User user) {
            String userShrink = shrink(user, "User", "json");
            this.putQueryParameter("User", userShrink);
            this.user = user;
            return this;
        }

        /**
         * Verifyad.
         */
        public Builder verifyad(java.util.List < Verifyad> verifyad) {
            String verifyadShrink = shrink(verifyad, "Verifyad", "json");
            this.putQueryParameter("Verifyad", verifyadShrink);
            this.verifyad = verifyad;
            return this;
        }

        @Override
        public VerifyAdvertisingRequest build() {
            return new VerifyAdvertisingRequest(this);
        } 

    } 

    public static class App extends TeaModel {
        @NameInMap("Ext")
        private java.util.Map < String, ? > ext;

        @NameInMap("Mediaid")
        private String mediaid;

        @NameInMap("Sn")
        private String sn;

        private App(Builder builder) {
            this.ext = builder.ext;
            this.mediaid = builder.mediaid;
            this.sn = builder.sn;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static App create() {
            return builder().build();
        }

        /**
         * @return ext
         */
        public java.util.Map < String, ? > getExt() {
            return this.ext;
        }

        /**
         * @return mediaid
         */
        public String getMediaid() {
            return this.mediaid;
        }

        /**
         * @return sn
         */
        public String getSn() {
            return this.sn;
        }

        public static final class Builder {
            private java.util.Map < String, ? > ext; 
            private String mediaid; 
            private String sn; 

            /**
             * ext
             */
            public Builder ext(java.util.Map < String, ? > ext) {
                this.ext = ext;
                return this;
            }

            /**
             * mediaid
             */
            public Builder mediaid(String mediaid) {
                this.mediaid = mediaid;
                return this;
            }

            /**
             * sn
             */
            public Builder sn(String sn) {
                this.sn = sn;
                return this;
            }

            public App build() {
                return new App(this);
            } 

        } 

    }
    public static class Geo extends TeaModel {
        @NameInMap("City")
        private String city;

        @NameInMap("District")
        private String district;

        @NameInMap("Lat")
        private Double lat;

        @NameInMap("Lon")
        private Double lon;

        @NameInMap("Province")
        private String province;

        private Geo(Builder builder) {
            this.city = builder.city;
            this.district = builder.district;
            this.lat = builder.lat;
            this.lon = builder.lon;
            this.province = builder.province;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Geo create() {
            return builder().build();
        }

        /**
         * @return city
         */
        public String getCity() {
            return this.city;
        }

        /**
         * @return district
         */
        public String getDistrict() {
            return this.district;
        }

        /**
         * @return lat
         */
        public Double getLat() {
            return this.lat;
        }

        /**
         * @return lon
         */
        public Double getLon() {
            return this.lon;
        }

        /**
         * @return province
         */
        public String getProvince() {
            return this.province;
        }

        public static final class Builder {
            private String city; 
            private String district; 
            private Double lat; 
            private Double lon; 
            private String province; 

            /**
             * City.
             */
            public Builder city(String city) {
                this.city = city;
                return this;
            }

            /**
             * District.
             */
            public Builder district(String district) {
                this.district = district;
                return this;
            }

            /**
             * lat
             */
            public Builder lat(Double lat) {
                this.lat = lat;
                return this;
            }

            /**
             * lon
             */
            public Builder lon(Double lon) {
                this.lon = lon;
                return this;
            }

            /**
             * Province.
             */
            public Builder province(String province) {
                this.province = province;
                return this;
            }

            public Geo build() {
                return new Geo(this);
            } 

        } 

    }
    public static class Device extends TeaModel {
        @NameInMap("Androidid")
        private String androidid;

        @NameInMap("Androidmd5")
        private String androidmd5;

        @NameInMap("Caid")
        private String caid;

        @NameInMap("Carrier")
        private String carrier;

        @NameInMap("Connectiontype")
        private Integer connectiontype;

        @NameInMap("Devicetype")
        private Integer devicetype;

        @NameInMap("Geo")
        private Geo geo;

        @NameInMap("Idfa")
        private String idfa;

        @NameInMap("Imei")
        private String imei;

        @NameInMap("Imeimd5")
        private String imeimd5;

        @NameInMap("Ip")
        private String ip;

        @NameInMap("Language")
        private String language;

        @NameInMap("Mac")
        private String mac;

        @NameInMap("Macmd5")
        private String macmd5;

        @NameInMap("Make")
        private String make;

        @NameInMap("Model")
        private String model;

        @NameInMap("Oaid")
        private String oaid;

        @NameInMap("Os")
        private String os;

        @NameInMap("Osv")
        private String osv;

        @NameInMap("Ua")
        private String ua;

        @NameInMap("Utdid")
        private String utdid;

        private Device(Builder builder) {
            this.androidid = builder.androidid;
            this.androidmd5 = builder.androidmd5;
            this.caid = builder.caid;
            this.carrier = builder.carrier;
            this.connectiontype = builder.connectiontype;
            this.devicetype = builder.devicetype;
            this.geo = builder.geo;
            this.idfa = builder.idfa;
            this.imei = builder.imei;
            this.imeimd5 = builder.imeimd5;
            this.ip = builder.ip;
            this.language = builder.language;
            this.mac = builder.mac;
            this.macmd5 = builder.macmd5;
            this.make = builder.make;
            this.model = builder.model;
            this.oaid = builder.oaid;
            this.os = builder.os;
            this.osv = builder.osv;
            this.ua = builder.ua;
            this.utdid = builder.utdid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Device create() {
            return builder().build();
        }

        /**
         * @return androidid
         */
        public String getAndroidid() {
            return this.androidid;
        }

        /**
         * @return androidmd5
         */
        public String getAndroidmd5() {
            return this.androidmd5;
        }

        /**
         * @return caid
         */
        public String getCaid() {
            return this.caid;
        }

        /**
         * @return carrier
         */
        public String getCarrier() {
            return this.carrier;
        }

        /**
         * @return connectiontype
         */
        public Integer getConnectiontype() {
            return this.connectiontype;
        }

        /**
         * @return devicetype
         */
        public Integer getDevicetype() {
            return this.devicetype;
        }

        /**
         * @return geo
         */
        public Geo getGeo() {
            return this.geo;
        }

        /**
         * @return idfa
         */
        public String getIdfa() {
            return this.idfa;
        }

        /**
         * @return imei
         */
        public String getImei() {
            return this.imei;
        }

        /**
         * @return imeimd5
         */
        public String getImeimd5() {
            return this.imeimd5;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return language
         */
        public String getLanguage() {
            return this.language;
        }

        /**
         * @return mac
         */
        public String getMac() {
            return this.mac;
        }

        /**
         * @return macmd5
         */
        public String getMacmd5() {
            return this.macmd5;
        }

        /**
         * @return make
         */
        public String getMake() {
            return this.make;
        }

        /**
         * @return model
         */
        public String getModel() {
            return this.model;
        }

        /**
         * @return oaid
         */
        public String getOaid() {
            return this.oaid;
        }

        /**
         * @return os
         */
        public String getOs() {
            return this.os;
        }

        /**
         * @return osv
         */
        public String getOsv() {
            return this.osv;
        }

        /**
         * @return ua
         */
        public String getUa() {
            return this.ua;
        }

        /**
         * @return utdid
         */
        public String getUtdid() {
            return this.utdid;
        }

        public static final class Builder {
            private String androidid; 
            private String androidmd5; 
            private String caid; 
            private String carrier; 
            private Integer connectiontype; 
            private Integer devicetype; 
            private Geo geo; 
            private String idfa; 
            private String imei; 
            private String imeimd5; 
            private String ip; 
            private String language; 
            private String mac; 
            private String macmd5; 
            private String make; 
            private String model; 
            private String oaid; 
            private String os; 
            private String osv; 
            private String ua; 
            private String utdid; 

            /**
             * androidid
             */
            public Builder androidid(String androidid) {
                this.androidid = androidid;
                return this;
            }

            /**
             * androidmd5
             */
            public Builder androidmd5(String androidmd5) {
                this.androidmd5 = androidmd5;
                return this;
            }

            /**
             * Caid
             */
            public Builder caid(String caid) {
                this.caid = caid;
                return this;
            }

            /**
             * Carrier.
             */
            public Builder carrier(String carrier) {
                this.carrier = carrier;
                return this;
            }

            /**
             * Connectiontype.
             */
            public Builder connectiontype(Integer connectiontype) {
                this.connectiontype = connectiontype;
                return this;
            }

            /**
             * deviceType
             */
            public Builder devicetype(Integer devicetype) {
                this.devicetype = devicetype;
                return this;
            }

            /**
             * Geo.
             */
            public Builder geo(Geo geo) {
                this.geo = geo;
                return this;
            }

            /**
             * Idfa
             */
            public Builder idfa(String idfa) {
                this.idfa = idfa;
                return this;
            }

            /**
             * imei
             */
            public Builder imei(String imei) {
                this.imei = imei;
                return this;
            }

            /**
             * imeimd5
             */
            public Builder imeimd5(String imeimd5) {
                this.imeimd5 = imeimd5;
                return this;
            }

            /**
             * Ip.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * Language.
             */
            public Builder language(String language) {
                this.language = language;
                return this;
            }

            /**
             * Mac.
             */
            public Builder mac(String mac) {
                this.mac = mac;
                return this;
            }

            /**
             * Macmd5
             */
            public Builder macmd5(String macmd5) {
                this.macmd5 = macmd5;
                return this;
            }

            /**
             * make
             */
            public Builder make(String make) {
                this.make = make;
                return this;
            }

            /**
             * model
             */
            public Builder model(String model) {
                this.model = model;
                return this;
            }

            /**
             * oaid
             */
            public Builder oaid(String oaid) {
                this.oaid = oaid;
                return this;
            }

            /**
             * os
             */
            public Builder os(String os) {
                this.os = os;
                return this;
            }

            /**
             * osv
             */
            public Builder osv(String osv) {
                this.osv = osv;
                return this;
            }

            /**
             * ua
             */
            public Builder ua(String ua) {
                this.ua = ua;
                return this;
            }

            /**
             * Utdid
             */
            public Builder utdid(String utdid) {
                this.utdid = utdid;
                return this;
            }

            public Device build() {
                return new Device(this);
            } 

        } 

    }
    public static class Imp extends TeaModel {
        @NameInMap("Id")
        private String id;

        @NameInMap("Tagid")
        private String tagid;

        private Imp(Builder builder) {
            this.id = builder.id;
            this.tagid = builder.tagid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Imp create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return tagid
         */
        public String getTagid() {
            return this.tagid;
        }

        public static final class Builder {
            private String id; 
            private String tagid; 

            /**
             * id
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * tagid
             */
            public Builder tagid(String tagid) {
                this.tagid = tagid;
                return this;
            }

            public Imp build() {
                return new Imp(this);
            } 

        } 

    }
    public static class User extends TeaModel {
        @NameInMap("Id")
        private String id;

        @NameInMap("Usertype")
        private String usertype;

        private User(Builder builder) {
            this.id = builder.id;
            this.usertype = builder.usertype;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static User create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return usertype
         */
        public String getUsertype() {
            return this.usertype;
        }

        public static final class Builder {
            private String id; 
            private String usertype; 

            /**
             * uid
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * uidtype
             */
            public Builder usertype(String usertype) {
                this.usertype = usertype;
                return this;
            }

            public User build() {
                return new User(this);
            } 

        } 

    }
    public static class Verifyad extends TeaModel {
        @NameInMap("Id")
        private String id;

        @NameInMap("Seat")
        private String seat;

        private Verifyad(Builder builder) {
            this.id = builder.id;
            this.seat = builder.seat;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Verifyad create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return seat
         */
        public String getSeat() {
            return this.seat;
        }

        public static final class Builder {
            private String id; 
            private String seat; 

            /**
             * uid
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Seat.
             */
            public Builder seat(String seat) {
                this.seat = seat;
                return this;
            }

            public Verifyad build() {
                return new Verifyad(this);
            } 

        } 

    }
}
