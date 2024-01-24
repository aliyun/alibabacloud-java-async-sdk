// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imarketing20220704.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAdxCreativeContentRequest} extends {@link RequestModel}
 *
 * <p>UpdateAdxCreativeContentRequest</p>
 */
public class UpdateAdxCreativeContentRequest extends Request {
    @Query
    @NameInMap("Ad")
    private java.util.List < Ad> ad;

    @Query
    @NameInMap("DspId")
    private String dspId;

    private UpdateAdxCreativeContentRequest(Builder builder) {
        super(builder);
        this.ad = builder.ad;
        this.dspId = builder.dspId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAdxCreativeContentRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ad
     */
    public java.util.List < Ad> getAd() {
        return this.ad;
    }

    /**
     * @return dspId
     */
    public String getDspId() {
        return this.dspId;
    }

    public static final class Builder extends Request.Builder<UpdateAdxCreativeContentRequest, Builder> {
        private java.util.List < Ad> ad; 
        private String dspId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAdxCreativeContentRequest request) {
            super(request);
            this.ad = request.ad;
            this.dspId = request.dspId;
        } 

        /**
         * Ad.
         */
        public Builder ad(java.util.List < Ad> ad) {
            this.putQueryParameter("Ad", ad);
            this.ad = ad;
            return this;
        }

        /**
         * DspId.
         */
        public Builder dspId(String dspId) {
            this.putQueryParameter("DspId", dspId);
            this.dspId = dspId;
            return this;
        }

        @Override
        public UpdateAdxCreativeContentRequest build() {
            return new UpdateAdxCreativeContentRequest(this);
        } 

    } 

    public static class Nativead extends TeaModel {
        @NameInMap("Attrname")
        private String attrname;

        @NameInMap("Attrvalue")
        private String attrvalue;

        @NameInMap("H")
        private Integer h;

        @NameInMap("Mime")
        private String mime;

        @NameInMap("W")
        private Integer w;

        private Nativead(Builder builder) {
            this.attrname = builder.attrname;
            this.attrvalue = builder.attrvalue;
            this.h = builder.h;
            this.mime = builder.mime;
            this.w = builder.w;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Nativead create() {
            return builder().build();
        }

        /**
         * @return attrname
         */
        public String getAttrname() {
            return this.attrname;
        }

        /**
         * @return attrvalue
         */
        public String getAttrvalue() {
            return this.attrvalue;
        }

        /**
         * @return h
         */
        public Integer getH() {
            return this.h;
        }

        /**
         * @return mime
         */
        public String getMime() {
            return this.mime;
        }

        /**
         * @return w
         */
        public Integer getW() {
            return this.w;
        }

        public static final class Builder {
            private String attrname; 
            private String attrvalue; 
            private Integer h; 
            private String mime; 
            private Integer w; 

            /**
             * Attrname.
             */
            public Builder attrname(String attrname) {
                this.attrname = attrname;
                return this;
            }

            /**
             * Attrvalue.
             */
            public Builder attrvalue(String attrvalue) {
                this.attrvalue = attrvalue;
                return this;
            }

            /**
             * H.
             */
            public Builder h(Integer h) {
                this.h = h;
                return this;
            }

            /**
             * Mime.
             */
            public Builder mime(String mime) {
                this.mime = mime;
                return this;
            }

            /**
             * W.
             */
            public Builder w(Integer w) {
                this.w = w;
                return this;
            }

            public Nativead build() {
                return new Nativead(this);
            } 

        } 

    }
    public static class Ad extends TeaModel {
        @NameInMap("Bundle")
        private java.util.List < String > bundle;

        @NameInMap("Clicks")
        private java.util.List < String > clicks;

        @NameInMap("Crid")
        private String crid;

        @NameInMap("Enddate")
        private String enddate;

        @NameInMap("Imps")
        private java.util.List < String > imps;

        @NameInMap("Interacttype")
        private Integer interacttype;

        @NameInMap("MediaIdList")
        private java.util.List < String > mediaIdList;

        @NameInMap("Nativead")
        private java.util.List < Nativead> nativead;

        @NameInMap("Op")
        private Integer op;

        @NameInMap("Ostype")
        private String ostype;

        @NameInMap("Prereview")
        private Boolean prereview;

        @NameInMap("Seat")
        private String seat;

        @NameInMap("Startdate")
        private String startdate;

        @NameInMap("Template")
        private Integer template;

        @NameInMap("Type")
        private Integer type;

        private Ad(Builder builder) {
            this.bundle = builder.bundle;
            this.clicks = builder.clicks;
            this.crid = builder.crid;
            this.enddate = builder.enddate;
            this.imps = builder.imps;
            this.interacttype = builder.interacttype;
            this.mediaIdList = builder.mediaIdList;
            this.nativead = builder.nativead;
            this.op = builder.op;
            this.ostype = builder.ostype;
            this.prereview = builder.prereview;
            this.seat = builder.seat;
            this.startdate = builder.startdate;
            this.template = builder.template;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ad create() {
            return builder().build();
        }

        /**
         * @return bundle
         */
        public java.util.List < String > getBundle() {
            return this.bundle;
        }

        /**
         * @return clicks
         */
        public java.util.List < String > getClicks() {
            return this.clicks;
        }

        /**
         * @return crid
         */
        public String getCrid() {
            return this.crid;
        }

        /**
         * @return enddate
         */
        public String getEnddate() {
            return this.enddate;
        }

        /**
         * @return imps
         */
        public java.util.List < String > getImps() {
            return this.imps;
        }

        /**
         * @return interacttype
         */
        public Integer getInteracttype() {
            return this.interacttype;
        }

        /**
         * @return mediaIdList
         */
        public java.util.List < String > getMediaIdList() {
            return this.mediaIdList;
        }

        /**
         * @return nativead
         */
        public java.util.List < Nativead> getNativead() {
            return this.nativead;
        }

        /**
         * @return op
         */
        public Integer getOp() {
            return this.op;
        }

        /**
         * @return ostype
         */
        public String getOstype() {
            return this.ostype;
        }

        /**
         * @return prereview
         */
        public Boolean getPrereview() {
            return this.prereview;
        }

        /**
         * @return seat
         */
        public String getSeat() {
            return this.seat;
        }

        /**
         * @return startdate
         */
        public String getStartdate() {
            return this.startdate;
        }

        /**
         * @return template
         */
        public Integer getTemplate() {
            return this.template;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        public static final class Builder {
            private java.util.List < String > bundle; 
            private java.util.List < String > clicks; 
            private String crid; 
            private String enddate; 
            private java.util.List < String > imps; 
            private Integer interacttype; 
            private java.util.List < String > mediaIdList; 
            private java.util.List < Nativead> nativead; 
            private Integer op; 
            private String ostype; 
            private Boolean prereview; 
            private String seat; 
            private String startdate; 
            private Integer template; 
            private Integer type; 

            /**
             * Bundle.
             */
            public Builder bundle(java.util.List < String > bundle) {
                this.bundle = bundle;
                return this;
            }

            /**
             * Clicks.
             */
            public Builder clicks(java.util.List < String > clicks) {
                this.clicks = clicks;
                return this;
            }

            /**
             * Crid.
             */
            public Builder crid(String crid) {
                this.crid = crid;
                return this;
            }

            /**
             * Enddate.
             */
            public Builder enddate(String enddate) {
                this.enddate = enddate;
                return this;
            }

            /**
             * Imps.
             */
            public Builder imps(java.util.List < String > imps) {
                this.imps = imps;
                return this;
            }

            /**
             * Interacttype.
             */
            public Builder interacttype(Integer interacttype) {
                this.interacttype = interacttype;
                return this;
            }

            /**
             * MediaIdList.
             */
            public Builder mediaIdList(java.util.List < String > mediaIdList) {
                this.mediaIdList = mediaIdList;
                return this;
            }

            /**
             * Nativead.
             */
            public Builder nativead(java.util.List < Nativead> nativead) {
                this.nativead = nativead;
                return this;
            }

            /**
             * Op.
             */
            public Builder op(Integer op) {
                this.op = op;
                return this;
            }

            /**
             * Ostype.
             */
            public Builder ostype(String ostype) {
                this.ostype = ostype;
                return this;
            }

            /**
             * Prereview.
             */
            public Builder prereview(Boolean prereview) {
                this.prereview = prereview;
                return this;
            }

            /**
             * Seat.
             */
            public Builder seat(String seat) {
                this.seat = seat;
                return this;
            }

            /**
             * Startdate.
             */
            public Builder startdate(String startdate) {
                this.startdate = startdate;
                return this;
            }

            /**
             * Template.
             */
            public Builder template(Integer template) {
                this.template = template;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            public Ad build() {
                return new Ad(this);
            } 

        } 

    }
}
