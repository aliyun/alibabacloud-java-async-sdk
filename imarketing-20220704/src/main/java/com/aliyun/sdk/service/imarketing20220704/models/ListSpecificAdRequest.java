// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imarketing20220704.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSpecificAdRequest} extends {@link RequestModel}
 *
 * <p>ListSpecificAdRequest</p>
 */
public class ListSpecificAdRequest extends Request {
    @Query
    @NameInMap("App")
    private App app;

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
    @NameInMap("User")
    private User user;

    @Query
    @NameInMap("Verifyad")
    private java.util.List < Verifyad> verifyad;

    private ListSpecificAdRequest(Builder builder) {
        super(builder);
        this.app = builder.app;
        this.ext = builder.ext;
        this.id = builder.id;
        this.imp = builder.imp;
        this.user = builder.user;
        this.verifyad = builder.verifyad;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSpecificAdRequest create() {
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

    public static final class Builder extends Request.Builder<ListSpecificAdRequest, Builder> {
        private App app; 
        private java.util.Map < String, ? > ext; 
        private String id; 
        private java.util.List < Imp> imp; 
        private User user; 
        private java.util.List < Verifyad> verifyad; 

        private Builder() {
            super();
        } 

        private Builder(ListSpecificAdRequest request) {
            super(request);
            this.app = request.app;
            this.ext = request.ext;
            this.id = request.id;
            this.imp = request.imp;
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
         * Ext.
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
        public ListSpecificAdRequest build() {
            return new ListSpecificAdRequest(this);
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

        @NameInMap("Itemid")
        private String itemid;

        @NameInMap("Marketingtype")
        private String marketingtype;

        @NameInMap("Seat")
        private String seat;

        private Verifyad(Builder builder) {
            this.id = builder.id;
            this.itemid = builder.itemid;
            this.marketingtype = builder.marketingtype;
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
         * @return itemid
         */
        public String getItemid() {
            return this.itemid;
        }

        /**
         * @return marketingtype
         */
        public String getMarketingtype() {
            return this.marketingtype;
        }

        /**
         * @return seat
         */
        public String getSeat() {
            return this.seat;
        }

        public static final class Builder {
            private String id; 
            private String itemid; 
            private String marketingtype; 
            private String seat; 

            /**
             * id
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Itemid.
             */
            public Builder itemid(String itemid) {
                this.itemid = itemid;
                return this;
            }

            /**
             * Marketingtype.
             */
            public Builder marketingtype(String marketingtype) {
                this.marketingtype = marketingtype;
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
