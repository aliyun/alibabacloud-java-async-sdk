// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imarketing20220704.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link VerifyAdvertisingResponseBody} extends {@link TeaModel}
 *
 * <p>VerifyAdvertisingResponseBody</p>
 */
public class VerifyAdvertisingResponseBody extends TeaModel {
    @NameInMap("Errorcode")
    private String errorcode;

    @NameInMap("Errormsg")
    private String errormsg;

    @NameInMap("Ext")
    private java.util.Map < String, String > ext;

    @NameInMap("Header")
    private VerifyAdvertisingResponseBodyHeader header;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    @NameInMap("Success")
    private Boolean success;

    private VerifyAdvertisingResponseBody(Builder builder) {
        this.errorcode = builder.errorcode;
        this.errormsg = builder.errormsg;
        this.ext = builder.ext;
        this.header = builder.header;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VerifyAdvertisingResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorcode
     */
    public String getErrorcode() {
        return this.errorcode;
    }

    /**
     * @return errormsg
     */
    public String getErrormsg() {
        return this.errormsg;
    }

    /**
     * @return ext
     */
    public java.util.Map < String, String > getExt() {
        return this.ext;
    }

    /**
     * @return header
     */
    public VerifyAdvertisingResponseBodyHeader getHeader() {
        return this.header;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String errorcode; 
        private String errormsg; 
        private java.util.Map < String, String > ext; 
        private VerifyAdvertisingResponseBodyHeader header; 
        private String requestId; 
        private Result result; 
        private Boolean success; 

        /**
         * errorCode
         */
        public Builder errorcode(String errorcode) {
            this.errorcode = errorcode;
            return this;
        }

        /**
         * errorMsg
         */
        public Builder errormsg(String errormsg) {
            this.errormsg = errormsg;
            return this;
        }

        /**
         * ext
         */
        public Builder ext(java.util.Map < String, String > ext) {
            this.ext = ext;
            return this;
        }

        /**
         * header
         */
        public Builder header(VerifyAdvertisingResponseBodyHeader header) {
            this.header = header;
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
         * Result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * success
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public VerifyAdvertisingResponseBody build() {
            return new VerifyAdvertisingResponseBody(this);
        } 

    } 

    public static class VerifyAdvertisingResponseBodyHeader extends TeaModel {
        @NameInMap("CostTime")
        private Long costTime;

        @NameInMap("RpcId")
        private String rpcId;

        @NameInMap("TraceId")
        private String traceId;

        @NameInMap("Version")
        private String version;

        private VerifyAdvertisingResponseBodyHeader(Builder builder) {
            this.costTime = builder.costTime;
            this.rpcId = builder.rpcId;
            this.traceId = builder.traceId;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VerifyAdvertisingResponseBodyHeader create() {
            return builder().build();
        }

        /**
         * @return costTime
         */
        public Long getCostTime() {
            return this.costTime;
        }

        /**
         * @return rpcId
         */
        public String getRpcId() {
            return this.rpcId;
        }

        /**
         * @return traceId
         */
        public String getTraceId() {
            return this.traceId;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private Long costTime; 
            private String rpcId; 
            private String traceId; 
            private String version; 

            /**
             * costTime
             */
            public Builder costTime(Long costTime) {
                this.costTime = costTime;
                return this;
            }

            /**
             * rpcId
             */
            public Builder rpcId(String rpcId) {
                this.rpcId = rpcId;
                return this;
            }

            /**
             * traceId
             */
            public Builder traceId(String traceId) {
                this.traceId = traceId;
                return this;
            }

            /**
             * version
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public VerifyAdvertisingResponseBodyHeader build() {
                return new VerifyAdvertisingResponseBodyHeader(this);
            } 

        } 

    }
    public static class Icon extends TeaModel {
        @NameInMap("Url")
        private String url;

        private Icon(Builder builder) {
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Icon create() {
            return builder().build();
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String url; 

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public Icon build() {
                return new Icon(this);
            } 

        } 

    }
    public static class Images extends TeaModel {
        @NameInMap("Desc")
        private String desc;

        @NameInMap("Format")
        private String format;

        @NameInMap("Url")
        private String url;

        private Images(Builder builder) {
            this.desc = builder.desc;
            this.format = builder.format;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Images create() {
            return builder().build();
        }

        /**
         * @return desc
         */
        public String getDesc() {
            return this.desc;
        }

        /**
         * @return format
         */
        public String getFormat() {
            return this.format;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String desc; 
            private String format; 
            private String url; 

            /**
             * Desc.
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * Format.
             */
            public Builder format(String format) {
                this.format = format;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public Images build() {
                return new Images(this);
            } 

        } 

    }
    public static class Trackers extends TeaModel {
        @NameInMap("Imps")
        private java.util.List < String > imps;

        private Trackers(Builder builder) {
            this.imps = builder.imps;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Trackers create() {
            return builder().build();
        }

        /**
         * @return imps
         */
        public java.util.List < String > getImps() {
            return this.imps;
        }

        public static final class Builder {
            private java.util.List < String > imps; 

            /**
             * Imps.
             */
            public Builder imps(java.util.List < String > imps) {
                this.imps = imps;
                return this;
            }

            public Trackers build() {
                return new Trackers(this);
            } 

        } 

    }
    public static class Ads extends TeaModel {
        @NameInMap("Crid")
        private String crid;

        @NameInMap("Crurl")
        private String crurl;

        @NameInMap("Icon")
        private Icon icon;

        @NameInMap("Id")
        private String id;

        @NameInMap("Images")
        private java.util.List < Images> images;

        @NameInMap("Interacttype")
        private Integer interacttype;

        @NameInMap("Labeltype")
        private String labeltype;

        @NameInMap("Landingurls")
        private java.util.List < String > landingurls;

        @NameInMap("Marketingtype")
        private String marketingtype;

        @NameInMap("Objective")
        private String objective;

        @NameInMap("Price")
        private String price;

        @NameInMap("Seat")
        private String seat;

        @NameInMap("Style")
        private String style;

        @NameInMap("Title")
        private String title;

        @NameInMap("Trackers")
        private Trackers trackers;

        @NameInMap("Type")
        private String type;

        private Ads(Builder builder) {
            this.crid = builder.crid;
            this.crurl = builder.crurl;
            this.icon = builder.icon;
            this.id = builder.id;
            this.images = builder.images;
            this.interacttype = builder.interacttype;
            this.labeltype = builder.labeltype;
            this.landingurls = builder.landingurls;
            this.marketingtype = builder.marketingtype;
            this.objective = builder.objective;
            this.price = builder.price;
            this.seat = builder.seat;
            this.style = builder.style;
            this.title = builder.title;
            this.trackers = builder.trackers;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ads create() {
            return builder().build();
        }

        /**
         * @return crid
         */
        public String getCrid() {
            return this.crid;
        }

        /**
         * @return crurl
         */
        public String getCrurl() {
            return this.crurl;
        }

        /**
         * @return icon
         */
        public Icon getIcon() {
            return this.icon;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return images
         */
        public java.util.List < Images> getImages() {
            return this.images;
        }

        /**
         * @return interacttype
         */
        public Integer getInteracttype() {
            return this.interacttype;
        }

        /**
         * @return labeltype
         */
        public String getLabeltype() {
            return this.labeltype;
        }

        /**
         * @return landingurls
         */
        public java.util.List < String > getLandingurls() {
            return this.landingurls;
        }

        /**
         * @return marketingtype
         */
        public String getMarketingtype() {
            return this.marketingtype;
        }

        /**
         * @return objective
         */
        public String getObjective() {
            return this.objective;
        }

        /**
         * @return price
         */
        public String getPrice() {
            return this.price;
        }

        /**
         * @return seat
         */
        public String getSeat() {
            return this.seat;
        }

        /**
         * @return style
         */
        public String getStyle() {
            return this.style;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return trackers
         */
        public Trackers getTrackers() {
            return this.trackers;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String crid; 
            private String crurl; 
            private Icon icon; 
            private String id; 
            private java.util.List < Images> images; 
            private Integer interacttype; 
            private String labeltype; 
            private java.util.List < String > landingurls; 
            private String marketingtype; 
            private String objective; 
            private String price; 
            private String seat; 
            private String style; 
            private String title; 
            private Trackers trackers; 
            private String type; 

            /**
             * crid
             */
            public Builder crid(String crid) {
                this.crid = crid;
                return this;
            }

            /**
             * Crurl.
             */
            public Builder crurl(String crurl) {
                this.crurl = crurl;
                return this;
            }

            /**
             * Icon.
             */
            public Builder icon(Icon icon) {
                this.icon = icon;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Images.
             */
            public Builder images(java.util.List < Images> images) {
                this.images = images;
                return this;
            }

            /**
             * Interacttype
             */
            public Builder interacttype(Integer interacttype) {
                this.interacttype = interacttype;
                return this;
            }

            /**
             * Labeltype.
             */
            public Builder labeltype(String labeltype) {
                this.labeltype = labeltype;
                return this;
            }

            /**
             * Landingurls.
             */
            public Builder landingurls(java.util.List < String > landingurls) {
                this.landingurls = landingurls;
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
             * Objective.
             */
            public Builder objective(String objective) {
                this.objective = objective;
                return this;
            }

            /**
             * Price.
             */
            public Builder price(String price) {
                this.price = price;
                return this;
            }

            /**
             * seat
             */
            public Builder seat(String seat) {
                this.seat = seat;
                return this;
            }

            /**
             * Style.
             */
            public Builder style(String style) {
                this.style = style;
                return this;
            }

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * Trackers.
             */
            public Builder trackers(Trackers trackers) {
                this.trackers = trackers;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Ads build() {
                return new Ads(this);
            } 

        } 

    }
    public static class Bid extends TeaModel {
        @NameInMap("Ads")
        private java.util.List < Ads> ads;

        @NameInMap("Impid")
        private String impid;

        private Bid(Builder builder) {
            this.ads = builder.ads;
            this.impid = builder.impid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Bid create() {
            return builder().build();
        }

        /**
         * @return ads
         */
        public java.util.List < Ads> getAds() {
            return this.ads;
        }

        /**
         * @return impid
         */
        public String getImpid() {
            return this.impid;
        }

        public static final class Builder {
            private java.util.List < Ads> ads; 
            private String impid; 

            /**
             * Ads.
             */
            public Builder ads(java.util.List < Ads> ads) {
                this.ads = ads;
                return this;
            }

            /**
             * impId
             */
            public Builder impid(String impid) {
                this.impid = impid;
                return this;
            }

            public Bid build() {
                return new Bid(this);
            } 

        } 

    }
    public static class Seatbid extends TeaModel {
        @NameInMap("Bid")
        private java.util.List < Bid> bid;

        private Seatbid(Builder builder) {
            this.bid = builder.bid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Seatbid create() {
            return builder().build();
        }

        /**
         * @return bid
         */
        public java.util.List < Bid> getBid() {
            return this.bid;
        }

        public static final class Builder {
            private java.util.List < Bid> bid; 

            /**
             * bid
             */
            public Builder bid(java.util.List < Bid> bid) {
                this.bid = bid;
                return this;
            }

            public Seatbid build() {
                return new Seatbid(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @NameInMap("Bidid")
        private String bidid;

        @NameInMap("Id")
        private String id;

        @NameInMap("Seatbid")
        private java.util.List < Seatbid> seatbid;

        private Result(Builder builder) {
            this.bidid = builder.bidid;
            this.id = builder.id;
            this.seatbid = builder.seatbid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return bidid
         */
        public String getBidid() {
            return this.bidid;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return seatbid
         */
        public java.util.List < Seatbid> getSeatbid() {
            return this.seatbid;
        }

        public static final class Builder {
            private String bidid; 
            private String id; 
            private java.util.List < Seatbid> seatbid; 

            /**
             * Bidid.
             */
            public Builder bidid(String bidid) {
                this.bidid = bidid;
                return this;
            }

            /**
             * id
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Seatbid.
             */
            public Builder seatbid(java.util.List < Seatbid> seatbid) {
                this.seatbid = seatbid;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
