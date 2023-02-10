// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FlightSearchListResponseBody} extends {@link TeaModel}
 *
 * <p>FlightSearchListResponseBody</p>
 */
public class FlightSearchListResponseBody extends TeaModel {
    @NameInMap("code")
    private String code;

    @NameInMap("message")
    private String message;

    @NameInMap("module")
    private Module module;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("success")
    private Boolean success;

    @NameInMap("traceId")
    private String traceId;

    private FlightSearchListResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.module = builder.module;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FlightSearchListResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return module
     */
    public Module getModule() {
        return this.module;
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

    /**
     * @return traceId
     */
    public String getTraceId() {
        return this.traceId;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private Module module; 
        private String requestId; 
        private Boolean success; 
        private String traceId; 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * module.
         */
        public Builder module(Module module) {
            this.module = module;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * traceId.
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public FlightSearchListResponseBody build() {
            return new FlightSearchListResponseBody(this);
        } 

    } 

    public static class AirlineInfo extends TeaModel {
        @NameInMap("airline_code")
        private String airlineCode;

        @NameInMap("airline_name")
        private String airlineName;

        @NameInMap("airline_simple_name")
        private String airlineSimpleName;

        private AirlineInfo(Builder builder) {
            this.airlineCode = builder.airlineCode;
            this.airlineName = builder.airlineName;
            this.airlineSimpleName = builder.airlineSimpleName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AirlineInfo create() {
            return builder().build();
        }

        /**
         * @return airlineCode
         */
        public String getAirlineCode() {
            return this.airlineCode;
        }

        /**
         * @return airlineName
         */
        public String getAirlineName() {
            return this.airlineName;
        }

        /**
         * @return airlineSimpleName
         */
        public String getAirlineSimpleName() {
            return this.airlineSimpleName;
        }

        public static final class Builder {
            private String airlineCode; 
            private String airlineName; 
            private String airlineSimpleName; 

            /**
             * 必填项,航司编码
             */
            public Builder airlineCode(String airlineCode) {
                this.airlineCode = airlineCode;
                return this;
            }

            /**
             * 必填项,航司名称
             */
            public Builder airlineName(String airlineName) {
                this.airlineName = airlineName;
                return this;
            }

            /**
             * 必填项,航司简称
             */
            public Builder airlineSimpleName(String airlineSimpleName) {
                this.airlineSimpleName = airlineSimpleName;
                return this;
            }

            public AirlineInfo build() {
                return new AirlineInfo(this);
            } 

        } 

    }
    public static class ArrAirportInfo extends TeaModel {
        @NameInMap("airport_code")
        private String airportCode;

        @NameInMap("airport_name")
        private String airportName;

        @NameInMap("city_code")
        private String cityCode;

        @NameInMap("city_name")
        private String cityName;

        @NameInMap("terminal")
        private String terminal;

        private ArrAirportInfo(Builder builder) {
            this.airportCode = builder.airportCode;
            this.airportName = builder.airportName;
            this.cityCode = builder.cityCode;
            this.cityName = builder.cityName;
            this.terminal = builder.terminal;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ArrAirportInfo create() {
            return builder().build();
        }

        /**
         * @return airportCode
         */
        public String getAirportCode() {
            return this.airportCode;
        }

        /**
         * @return airportName
         */
        public String getAirportName() {
            return this.airportName;
        }

        /**
         * @return cityCode
         */
        public String getCityCode() {
            return this.cityCode;
        }

        /**
         * @return cityName
         */
        public String getCityName() {
            return this.cityName;
        }

        /**
         * @return terminal
         */
        public String getTerminal() {
            return this.terminal;
        }

        public static final class Builder {
            private String airportCode; 
            private String airportName; 
            private String cityCode; 
            private String cityName; 
            private String terminal; 

            /**
             * 必填项,机场编码
             */
            public Builder airportCode(String airportCode) {
                this.airportCode = airportCode;
                return this;
            }

            /**
             * 必填项,机场编码
             */
            public Builder airportName(String airportName) {
                this.airportName = airportName;
                return this;
            }

            /**
             * 必填项,城市编码
             */
            public Builder cityCode(String cityCode) {
                this.cityCode = cityCode;
                return this;
            }

            /**
             * 必填项,城市名称
             */
            public Builder cityName(String cityName) {
                this.cityName = cityName;
                return this;
            }

            /**
             * 必填项,航站楼
             */
            public Builder terminal(String terminal) {
                this.terminal = terminal;
                return this;
            }

            public ArrAirportInfo build() {
                return new ArrAirportInfo(this);
            } 

        } 

    }
    public static class Description extends TeaModel {
        @NameInMap("desc")
        private String desc;

        @NameInMap("icon")
        private String icon;

        @NameInMap("image")
        private String image;

        @NameInMap("title")
        private String title;

        private Description(Builder builder) {
            this.desc = builder.desc;
            this.icon = builder.icon;
            this.image = builder.image;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Description create() {
            return builder().build();
        }

        /**
         * @return desc
         */
        public String getDesc() {
            return this.desc;
        }

        /**
         * @return icon
         */
        public String getIcon() {
            return this.icon;
        }

        /**
         * @return image
         */
        public String getImage() {
            return this.image;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String desc; 
            private String icon; 
            private String image; 
            private String title; 

            /**
             * desc.
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * icon.
             */
            public Builder icon(String icon) {
                this.icon = icon;
                return this;
            }

            /**
             * image.
             */
            public Builder image(String image) {
                this.image = image;
                return this;
            }

            /**
             * title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public Description build() {
                return new Description(this);
            } 

        } 

    }
    public static class ImageDO extends TeaModel {
        @NameInMap("image")
        private String image;

        @NameInMap("largest")
        private String largest;

        @NameInMap("middle")
        private String middle;

        @NameInMap("smallest")
        private String smallest;

        private ImageDO(Builder builder) {
            this.image = builder.image;
            this.largest = builder.largest;
            this.middle = builder.middle;
            this.smallest = builder.smallest;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageDO create() {
            return builder().build();
        }

        /**
         * @return image
         */
        public String getImage() {
            return this.image;
        }

        /**
         * @return largest
         */
        public String getLargest() {
            return this.largest;
        }

        /**
         * @return middle
         */
        public String getMiddle() {
            return this.middle;
        }

        /**
         * @return smallest
         */
        public String getSmallest() {
            return this.smallest;
        }

        public static final class Builder {
            private String image; 
            private String largest; 
            private String middle; 
            private String smallest; 

            /**
             * image.
             */
            public Builder image(String image) {
                this.image = image;
                return this;
            }

            /**
             * largest.
             */
            public Builder largest(String largest) {
                this.largest = largest;
                return this;
            }

            /**
             * middle.
             */
            public Builder middle(String middle) {
                this.middle = middle;
                return this;
            }

            /**
             * smallest.
             */
            public Builder smallest(String smallest) {
                this.smallest = smallest;
                return this;
            }

            public ImageDO build() {
                return new ImageDO(this);
            } 

        } 

    }
    public static class BaggageSubContentVisualizes extends TeaModel {
        @NameInMap("baggage_desc")
        private java.util.List < String > baggageDesc;

        @NameInMap("baggage_sub_content_type")
        private Integer baggageSubContentType;

        @NameInMap("description")
        private Description description;

        @NameInMap("image_d_o")
        private ImageDO imageDO;

        @NameInMap("is_highlight")
        private Boolean isHighlight;

        @NameInMap("sub_title")
        private String subTitle;

        private BaggageSubContentVisualizes(Builder builder) {
            this.baggageDesc = builder.baggageDesc;
            this.baggageSubContentType = builder.baggageSubContentType;
            this.description = builder.description;
            this.imageDO = builder.imageDO;
            this.isHighlight = builder.isHighlight;
            this.subTitle = builder.subTitle;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BaggageSubContentVisualizes create() {
            return builder().build();
        }

        /**
         * @return baggageDesc
         */
        public java.util.List < String > getBaggageDesc() {
            return this.baggageDesc;
        }

        /**
         * @return baggageSubContentType
         */
        public Integer getBaggageSubContentType() {
            return this.baggageSubContentType;
        }

        /**
         * @return description
         */
        public Description getDescription() {
            return this.description;
        }

        /**
         * @return imageDO
         */
        public ImageDO getImageDO() {
            return this.imageDO;
        }

        /**
         * @return isHighlight
         */
        public Boolean getIsHighlight() {
            return this.isHighlight;
        }

        /**
         * @return subTitle
         */
        public String getSubTitle() {
            return this.subTitle;
        }

        public static final class Builder {
            private java.util.List < String > baggageDesc; 
            private Integer baggageSubContentType; 
            private Description description; 
            private ImageDO imageDO; 
            private Boolean isHighlight; 
            private String subTitle; 

            /**
             * baggage_desc.
             */
            public Builder baggageDesc(java.util.List < String > baggageDesc) {
                this.baggageDesc = baggageDesc;
                return this;
            }

            /**
             * baggage_sub_content_type.
             */
            public Builder baggageSubContentType(Integer baggageSubContentType) {
                this.baggageSubContentType = baggageSubContentType;
                return this;
            }

            /**
             * desc : 您可以随身携带上飞机客舱内的行李物品，由旅客自行负责保管。具体尺寸、重量、类型等以各航空公司规定为准。
             */
            public Builder description(Description description) {
                this.description = description;
                return this;
            }

            /**
             * image : https://gw.alicdn.com/imgextra/i3/O1CN01kLt3m923XsUs6WVif_!!6000000007266-2-tps-280-300.png
             */
            public Builder imageDO(ImageDO imageDO) {
                this.imageDO = imageDO;
                return this;
            }

            /**
             * is_highlight.
             */
            public Builder isHighlight(Boolean isHighlight) {
                this.isHighlight = isHighlight;
                return this;
            }

            /**
             * sub_title.
             */
            public Builder subTitle(String subTitle) {
                this.subTitle = subTitle;
                return this;
            }

            public BaggageSubContentVisualizes build() {
                return new BaggageSubContentVisualizes(this);
            } 

        } 

    }
    public static class BaggageSubItems extends TeaModel {
        @NameInMap("baggage_sub_content_visualizes")
        private java.util.List < BaggageSubContentVisualizes> baggageSubContentVisualizes;

        @NameInMap("extra_content_visualizes")
        private java.util.List < ? > extraContentVisualizes;

        @NameInMap("is_struct")
        private Boolean isStruct;

        @NameInMap("ptc")
        private String ptc;

        @NameInMap("title")
        private String title;

        private BaggageSubItems(Builder builder) {
            this.baggageSubContentVisualizes = builder.baggageSubContentVisualizes;
            this.extraContentVisualizes = builder.extraContentVisualizes;
            this.isStruct = builder.isStruct;
            this.ptc = builder.ptc;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BaggageSubItems create() {
            return builder().build();
        }

        /**
         * @return baggageSubContentVisualizes
         */
        public java.util.List < BaggageSubContentVisualizes> getBaggageSubContentVisualizes() {
            return this.baggageSubContentVisualizes;
        }

        /**
         * @return extraContentVisualizes
         */
        public java.util.List < ? > getExtraContentVisualizes() {
            return this.extraContentVisualizes;
        }

        /**
         * @return isStruct
         */
        public Boolean getIsStruct() {
            return this.isStruct;
        }

        /**
         * @return ptc
         */
        public String getPtc() {
            return this.ptc;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private java.util.List < BaggageSubContentVisualizes> baggageSubContentVisualizes; 
            private java.util.List < ? > extraContentVisualizes; 
            private Boolean isStruct; 
            private String ptc; 
            private String title; 

            /**
             * baggageDesc : ["每人可携带 1件 登机","至多 5公斤/件","尺寸不超过 20*40*55cm"]
             */
            public Builder baggageSubContentVisualizes(java.util.List < BaggageSubContentVisualizes> baggageSubContentVisualizes) {
                this.baggageSubContentVisualizes = baggageSubContentVisualizes;
                return this;
            }

            /**
             * extra_content_visualizes.
             */
            public Builder extraContentVisualizes(java.util.List < ? > extraContentVisualizes) {
                this.extraContentVisualizes = extraContentVisualizes;
                return this;
            }

            /**
             * baggageSubContentVisualizes : [
             */
            public Builder isStruct(Boolean isStruct) {
                this.isStruct = isStruct;
                return this;
            }

            /**
             * PTC
             */
            public Builder ptc(String ptc) {
                this.ptc = ptc;
                return this;
            }

            /**
             * title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public BaggageSubItems build() {
                return new BaggageSubItems(this);
            } 

        } 

    }
    public static class Tips extends TeaModel {
        @NameInMap("logo")
        private String logo;

        @NameInMap("tips_desc")
        private String tipsDesc;

        @NameInMap("tips_image")
        private String tipsImage;

        private Tips(Builder builder) {
            this.logo = builder.logo;
            this.tipsDesc = builder.tipsDesc;
            this.tipsImage = builder.tipsImage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tips create() {
            return builder().build();
        }

        /**
         * @return logo
         */
        public String getLogo() {
            return this.logo;
        }

        /**
         * @return tipsDesc
         */
        public String getTipsDesc() {
            return this.tipsDesc;
        }

        /**
         * @return tipsImage
         */
        public String getTipsImage() {
            return this.tipsImage;
        }

        public static final class Builder {
            private String logo; 
            private String tipsDesc; 
            private String tipsImage; 

            /**
             * logo.
             */
            public Builder logo(String logo) {
                this.logo = logo;
                return this;
            }

            /**
             * tips_desc.
             */
            public Builder tipsDesc(String tipsDesc) {
                this.tipsDesc = tipsDesc;
                return this;
            }

            /**
             * tips_image.
             */
            public Builder tipsImage(String tipsImage) {
                this.tipsImage = tipsImage;
                return this;
            }

            public Tips build() {
                return new Tips(this);
            } 

        } 

    }
    public static class BaggageItem extends TeaModel {
        @NameInMap("baggage_sub_items")
        private java.util.List < BaggageSubItems> baggageSubItems;

        @NameInMap("index")
        private Integer index;

        @NameInMap("table_head")
        private String tableHead;

        @NameInMap("tips")
        private Tips tips;

        @NameInMap("title")
        private String title;

        @NameInMap("type")
        private Integer type;

        private BaggageItem(Builder builder) {
            this.baggageSubItems = builder.baggageSubItems;
            this.index = builder.index;
            this.tableHead = builder.tableHead;
            this.tips = builder.tips;
            this.title = builder.title;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BaggageItem create() {
            return builder().build();
        }

        /**
         * @return baggageSubItems
         */
        public java.util.List < BaggageSubItems> getBaggageSubItems() {
            return this.baggageSubItems;
        }

        /**
         * @return index
         */
        public Integer getIndex() {
            return this.index;
        }

        /**
         * @return tableHead
         */
        public String getTableHead() {
            return this.tableHead;
        }

        /**
         * @return tips
         */
        public Tips getTips() {
            return this.tips;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        public static final class Builder {
            private java.util.List < BaggageSubItems> baggageSubItems; 
            private Integer index; 
            private String tableHead; 
            private Tips tips; 
            private String title; 
            private Integer type; 

            /**
             * baggage_sub_items.
             */
            public Builder baggageSubItems(java.util.List < BaggageSubItems> baggageSubItems) {
                this.baggageSubItems = baggageSubItems;
                return this;
            }

            /**
             * baggageSubItems : [
             */
            public Builder index(Integer index) {
                this.index = index;
                return this;
            }

            /**
             * table_head.
             */
            public Builder tableHead(String tableHead) {
                this.tableHead = tableHead;
                return this;
            }

            /**
             * logo : https://gw.alicdn.com/imgextra/i1/O1CN019zl3WZ22fNLxzx2cR_!!6000000007147-2-tps-125-45.png
             */
            public Builder tips(Tips tips) {
                this.tips = tips;
                return this;
            }

            /**
             * title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * type.
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            public BaggageItem build() {
                return new BaggageItem(this);
            } 

        } 

    }
    public static class Info extends TeaModel {
        @NameInMap("content")
        private String content;

        @NameInMap("cost")
        private Integer cost;

        @NameInMap("cost_percent")
        private Integer costPercent;

        @NameInMap("time_stamp")
        private Integer timeStamp;

        @NameInMap("time_type")
        private String timeType;

        @NameInMap("title")
        private String title;

        private Info(Builder builder) {
            this.content = builder.content;
            this.cost = builder.cost;
            this.costPercent = builder.costPercent;
            this.timeStamp = builder.timeStamp;
            this.timeType = builder.timeType;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Info create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return cost
         */
        public Integer getCost() {
            return this.cost;
        }

        /**
         * @return costPercent
         */
        public Integer getCostPercent() {
            return this.costPercent;
        }

        /**
         * @return timeStamp
         */
        public Integer getTimeStamp() {
            return this.timeStamp;
        }

        /**
         * @return timeType
         */
        public String getTimeType() {
            return this.timeType;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String content; 
            private Integer cost; 
            private Integer costPercent; 
            private Integer timeStamp; 
            private String timeType; 
            private String title; 

            /**
             * content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * cost.
             */
            public Builder cost(Integer cost) {
                this.cost = cost;
                return this;
            }

            /**
             * cost_percent.
             */
            public Builder costPercent(Integer costPercent) {
                this.costPercent = costPercent;
                return this;
            }

            /**
             * time_stamp.
             */
            public Builder timeStamp(Integer timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            /**
             * time_type.
             */
            public Builder timeType(String timeType) {
                this.timeType = timeType;
                return this;
            }

            /**
             * title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public Info build() {
                return new Info(this);
            } 

        } 

    }
    public static class ChangeRule extends TeaModel {
        @NameInMap("able")
        private Boolean able;

        @NameInMap("info")
        private java.util.List < Info> info;

        private ChangeRule(Builder builder) {
            this.able = builder.able;
            this.info = builder.info;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ChangeRule create() {
            return builder().build();
        }

        /**
         * @return able
         */
        public Boolean getAble() {
            return this.able;
        }

        /**
         * @return info
         */
        public java.util.List < Info> getInfo() {
            return this.info;
        }

        public static final class Builder {
            private Boolean able; 
            private java.util.List < Info> info; 

            /**
             * able.
             */
            public Builder able(Boolean able) {
                this.able = able;
                return this;
            }

            /**
             * info.
             */
            public Builder info(java.util.List < Info> info) {
                this.info = info;
                return this;
            }

            public ChangeRule build() {
                return new ChangeRule(this);
            } 

        } 

    }
    public static class ExtraContents extends TeaModel {
        @NameInMap("content")
        private String content;

        @NameInMap("title")
        private String title;

        private ExtraContents(Builder builder) {
            this.content = builder.content;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExtraContents create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String content; 
            private String title; 

            /**
             * content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public ExtraContents build() {
                return new ExtraContents(this);
            } 

        } 

    }
    public static class RefundSubContents extends TeaModel {
        @NameInMap("fee_desc")
        private String feeDesc;

        @NameInMap("fee_range")
        private String feeRange;

        @NameInMap("style")
        private Integer style;

        private RefundSubContents(Builder builder) {
            this.feeDesc = builder.feeDesc;
            this.feeRange = builder.feeRange;
            this.style = builder.style;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RefundSubContents create() {
            return builder().build();
        }

        /**
         * @return feeDesc
         */
        public String getFeeDesc() {
            return this.feeDesc;
        }

        /**
         * @return feeRange
         */
        public String getFeeRange() {
            return this.feeRange;
        }

        /**
         * @return style
         */
        public Integer getStyle() {
            return this.style;
        }

        public static final class Builder {
            private String feeDesc; 
            private String feeRange; 
            private Integer style; 

            /**
             * fee_desc.
             */
            public Builder feeDesc(String feeDesc) {
                this.feeDesc = feeDesc;
                return this;
            }

            /**
             * fee_range.
             */
            public Builder feeRange(String feeRange) {
                this.feeRange = feeRange;
                return this;
            }

            /**
             * style.
             */
            public Builder style(Integer style) {
                this.style = style;
                return this;
            }

            public RefundSubContents build() {
                return new RefundSubContents(this);
            } 

        } 

    }
    public static class RefundSubItems extends TeaModel {
        @NameInMap("is_struct")
        private Boolean isStruct;

        @NameInMap("ptc")
        private String ptc;

        @NameInMap("refund_sub_contents")
        private java.util.List < RefundSubContents> refundSubContents;

        @NameInMap("title")
        private String title;

        private RefundSubItems(Builder builder) {
            this.isStruct = builder.isStruct;
            this.ptc = builder.ptc;
            this.refundSubContents = builder.refundSubContents;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RefundSubItems create() {
            return builder().build();
        }

        /**
         * @return isStruct
         */
        public Boolean getIsStruct() {
            return this.isStruct;
        }

        /**
         * @return ptc
         */
        public String getPtc() {
            return this.ptc;
        }

        /**
         * @return refundSubContents
         */
        public java.util.List < RefundSubContents> getRefundSubContents() {
            return this.refundSubContents;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private Boolean isStruct; 
            private String ptc; 
            private java.util.List < RefundSubContents> refundSubContents; 
            private String title; 

            /**
             * isStruct : true
             */
            public Builder isStruct(Boolean isStruct) {
                this.isStruct = isStruct;
                return this;
            }

            /**
             * PTC
             */
            public Builder ptc(String ptc) {
                this.ptc = ptc;
                return this;
            }

            /**
             * feeDesc : ￥156/人
             */
            public Builder refundSubContents(java.util.List < RefundSubContents> refundSubContents) {
                this.refundSubContents = refundSubContents;
                return this;
            }

            /**
             * title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public RefundSubItems build() {
                return new RefundSubItems(this);
            } 

        } 

    }
    public static class ChangeRuleItem extends TeaModel {
        @NameInMap("extra_contents")
        private java.util.List < ExtraContents> extraContents;

        @NameInMap("index")
        private Integer index;

        @NameInMap("refund_sub_items")
        private java.util.List < RefundSubItems> refundSubItems;

        @NameInMap("sub_table_head")
        private java.util.List < String > subTableHead;

        @NameInMap("table_head")
        private String tableHead;

        @NameInMap("title")
        private String title;

        @NameInMap("type")
        private Integer type;

        private ChangeRuleItem(Builder builder) {
            this.extraContents = builder.extraContents;
            this.index = builder.index;
            this.refundSubItems = builder.refundSubItems;
            this.subTableHead = builder.subTableHead;
            this.tableHead = builder.tableHead;
            this.title = builder.title;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ChangeRuleItem create() {
            return builder().build();
        }

        /**
         * @return extraContents
         */
        public java.util.List < ExtraContents> getExtraContents() {
            return this.extraContents;
        }

        /**
         * @return index
         */
        public Integer getIndex() {
            return this.index;
        }

        /**
         * @return refundSubItems
         */
        public java.util.List < RefundSubItems> getRefundSubItems() {
            return this.refundSubItems;
        }

        /**
         * @return subTableHead
         */
        public java.util.List < String > getSubTableHead() {
            return this.subTableHead;
        }

        /**
         * @return tableHead
         */
        public String getTableHead() {
            return this.tableHead;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        public static final class Builder {
            private java.util.List < ExtraContents> extraContents; 
            private Integer index; 
            private java.util.List < RefundSubItems> refundSubItems; 
            private java.util.List < String > subTableHead; 
            private String tableHead; 
            private String title; 
            private Integer type; 

            /**
             * content : 不可签转
             */
            public Builder extraContents(java.util.List < ExtraContents> extraContents) {
                this.extraContents = extraContents;
                return this;
            }

            /**
             * extraContents : [
             */
            public Builder index(Integer index) {
                this.index = index;
                return this;
            }

            /**
             * refund_sub_items.
             */
            public Builder refundSubItems(java.util.List < RefundSubItems> refundSubItems) {
                this.refundSubItems = refundSubItems;
                return this;
            }

            /**
             * sub_table_head.
             */
            public Builder subTableHead(java.util.List < String > subTableHead) {
                this.subTableHead = subTableHead;
                return this;
            }

            /**
             * table_head.
             */
            public Builder tableHead(String tableHead) {
                this.tableHead = tableHead;
                return this;
            }

            /**
             * title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * type.
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            public ChangeRuleItem build() {
                return new ChangeRuleItem(this);
            } 

        } 

    }
    public static class RefundRuleInfo extends TeaModel {
        @NameInMap("content")
        private String content;

        @NameInMap("cost")
        private Integer cost;

        @NameInMap("cost_percent")
        private Integer costPercent;

        @NameInMap("time_stamp")
        private Integer timeStamp;

        @NameInMap("time_type")
        private String timeType;

        @NameInMap("title")
        private String title;

        private RefundRuleInfo(Builder builder) {
            this.content = builder.content;
            this.cost = builder.cost;
            this.costPercent = builder.costPercent;
            this.timeStamp = builder.timeStamp;
            this.timeType = builder.timeType;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RefundRuleInfo create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return cost
         */
        public Integer getCost() {
            return this.cost;
        }

        /**
         * @return costPercent
         */
        public Integer getCostPercent() {
            return this.costPercent;
        }

        /**
         * @return timeStamp
         */
        public Integer getTimeStamp() {
            return this.timeStamp;
        }

        /**
         * @return timeType
         */
        public String getTimeType() {
            return this.timeType;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String content; 
            private Integer cost; 
            private Integer costPercent; 
            private Integer timeStamp; 
            private String timeType; 
            private String title; 

            /**
             * content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * cost.
             */
            public Builder cost(Integer cost) {
                this.cost = cost;
                return this;
            }

            /**
             * cost_percent.
             */
            public Builder costPercent(Integer costPercent) {
                this.costPercent = costPercent;
                return this;
            }

            /**
             * time_stamp.
             */
            public Builder timeStamp(Integer timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            /**
             * time_type.
             */
            public Builder timeType(String timeType) {
                this.timeType = timeType;
                return this;
            }

            /**
             * title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public RefundRuleInfo build() {
                return new RefundRuleInfo(this);
            } 

        } 

    }
    public static class RefundRule extends TeaModel {
        @NameInMap("able")
        private Boolean able;

        @NameInMap("info")
        private java.util.List < RefundRuleInfo> info;

        private RefundRule(Builder builder) {
            this.able = builder.able;
            this.info = builder.info;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RefundRule create() {
            return builder().build();
        }

        /**
         * @return able
         */
        public Boolean getAble() {
            return this.able;
        }

        /**
         * @return info
         */
        public java.util.List < RefundRuleInfo> getInfo() {
            return this.info;
        }

        public static final class Builder {
            private Boolean able; 
            private java.util.List < RefundRuleInfo> info; 

            /**
             * able.
             */
            public Builder able(Boolean able) {
                this.able = able;
                return this;
            }

            /**
             * info.
             */
            public Builder info(java.util.List < RefundRuleInfo> info) {
                this.info = info;
                return this;
            }

            public RefundRule build() {
                return new RefundRule(this);
            } 

        } 

    }
    public static class RefundRuleItemExtraContents extends TeaModel {
        @NameInMap("content")
        private String content;

        @NameInMap("title")
        private String title;

        private RefundRuleItemExtraContents(Builder builder) {
            this.content = builder.content;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RefundRuleItemExtraContents create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String content; 
            private String title; 

            /**
             * content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public RefundRuleItemExtraContents build() {
                return new RefundRuleItemExtraContents(this);
            } 

        } 

    }
    public static class RefundSubItemsRefundSubContents extends TeaModel {
        @NameInMap("fee_desc")
        private String feeDesc;

        @NameInMap("fee_range")
        private String feeRange;

        @NameInMap("style")
        private Integer style;

        private RefundSubItemsRefundSubContents(Builder builder) {
            this.feeDesc = builder.feeDesc;
            this.feeRange = builder.feeRange;
            this.style = builder.style;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RefundSubItemsRefundSubContents create() {
            return builder().build();
        }

        /**
         * @return feeDesc
         */
        public String getFeeDesc() {
            return this.feeDesc;
        }

        /**
         * @return feeRange
         */
        public String getFeeRange() {
            return this.feeRange;
        }

        /**
         * @return style
         */
        public Integer getStyle() {
            return this.style;
        }

        public static final class Builder {
            private String feeDesc; 
            private String feeRange; 
            private Integer style; 

            /**
             * fee_desc.
             */
            public Builder feeDesc(String feeDesc) {
                this.feeDesc = feeDesc;
                return this;
            }

            /**
             * fee_range.
             */
            public Builder feeRange(String feeRange) {
                this.feeRange = feeRange;
                return this;
            }

            /**
             * style.
             */
            public Builder style(Integer style) {
                this.style = style;
                return this;
            }

            public RefundSubItemsRefundSubContents build() {
                return new RefundSubItemsRefundSubContents(this);
            } 

        } 

    }
    public static class RefundRuleItemRefundSubItems extends TeaModel {
        @NameInMap("is_struct")
        private Boolean isStruct;

        @NameInMap("ptc")
        private String ptc;

        @NameInMap("refund_sub_contents")
        private java.util.List < RefundSubItemsRefundSubContents> refundSubContents;

        @NameInMap("title")
        private String title;

        private RefundRuleItemRefundSubItems(Builder builder) {
            this.isStruct = builder.isStruct;
            this.ptc = builder.ptc;
            this.refundSubContents = builder.refundSubContents;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RefundRuleItemRefundSubItems create() {
            return builder().build();
        }

        /**
         * @return isStruct
         */
        public Boolean getIsStruct() {
            return this.isStruct;
        }

        /**
         * @return ptc
         */
        public String getPtc() {
            return this.ptc;
        }

        /**
         * @return refundSubContents
         */
        public java.util.List < RefundSubItemsRefundSubContents> getRefundSubContents() {
            return this.refundSubContents;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private Boolean isStruct; 
            private String ptc; 
            private java.util.List < RefundSubItemsRefundSubContents> refundSubContents; 
            private String title; 

            /**
             * isStruct : true
             */
            public Builder isStruct(Boolean isStruct) {
                this.isStruct = isStruct;
                return this;
            }

            /**
             * PTC
             */
            public Builder ptc(String ptc) {
                this.ptc = ptc;
                return this;
            }

            /**
             * feeDesc : ￥156/人
             */
            public Builder refundSubContents(java.util.List < RefundSubItemsRefundSubContents> refundSubContents) {
                this.refundSubContents = refundSubContents;
                return this;
            }

            /**
             * title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public RefundRuleItemRefundSubItems build() {
                return new RefundRuleItemRefundSubItems(this);
            } 

        } 

    }
    public static class RefundRuleItem extends TeaModel {
        @NameInMap("extra_contents")
        private java.util.List < RefundRuleItemExtraContents> extraContents;

        @NameInMap("index")
        private Integer index;

        @NameInMap("refund_sub_items")
        private java.util.List < RefundRuleItemRefundSubItems> refundSubItems;

        @NameInMap("sub_table_head")
        private java.util.List < String > subTableHead;

        @NameInMap("table_head")
        private String tableHead;

        @NameInMap("title")
        private String title;

        @NameInMap("type")
        private Integer type;

        private RefundRuleItem(Builder builder) {
            this.extraContents = builder.extraContents;
            this.index = builder.index;
            this.refundSubItems = builder.refundSubItems;
            this.subTableHead = builder.subTableHead;
            this.tableHead = builder.tableHead;
            this.title = builder.title;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RefundRuleItem create() {
            return builder().build();
        }

        /**
         * @return extraContents
         */
        public java.util.List < RefundRuleItemExtraContents> getExtraContents() {
            return this.extraContents;
        }

        /**
         * @return index
         */
        public Integer getIndex() {
            return this.index;
        }

        /**
         * @return refundSubItems
         */
        public java.util.List < RefundRuleItemRefundSubItems> getRefundSubItems() {
            return this.refundSubItems;
        }

        /**
         * @return subTableHead
         */
        public java.util.List < String > getSubTableHead() {
            return this.subTableHead;
        }

        /**
         * @return tableHead
         */
        public String getTableHead() {
            return this.tableHead;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        public static final class Builder {
            private java.util.List < RefundRuleItemExtraContents> extraContents; 
            private Integer index; 
            private java.util.List < RefundRuleItemRefundSubItems> refundSubItems; 
            private java.util.List < String > subTableHead; 
            private String tableHead; 
            private String title; 
            private Integer type; 

            /**
             * content : 不可签转
             */
            public Builder extraContents(java.util.List < RefundRuleItemExtraContents> extraContents) {
                this.extraContents = extraContents;
                return this;
            }

            /**
             * extraContents : [
             */
            public Builder index(Integer index) {
                this.index = index;
                return this;
            }

            /**
             * refund_sub_items.
             */
            public Builder refundSubItems(java.util.List < RefundRuleItemRefundSubItems> refundSubItems) {
                this.refundSubItems = refundSubItems;
                return this;
            }

            /**
             * sub_table_head.
             */
            public Builder subTableHead(java.util.List < String > subTableHead) {
                this.subTableHead = subTableHead;
                return this;
            }

            /**
             * table_head.
             */
            public Builder tableHead(String tableHead) {
                this.tableHead = tableHead;
                return this;
            }

            /**
             * title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * type.
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            public RefundRuleItem build() {
                return new RefundRuleItem(this);
            } 

        } 

    }
    public static class SignRuleInfo extends TeaModel {
        @NameInMap("content")
        private String content;

        @NameInMap("cost")
        private Integer cost;

        @NameInMap("cost_percent")
        private Integer costPercent;

        @NameInMap("time_stamp")
        private Integer timeStamp;

        @NameInMap("time_type")
        private String timeType;

        @NameInMap("title")
        private String title;

        private SignRuleInfo(Builder builder) {
            this.content = builder.content;
            this.cost = builder.cost;
            this.costPercent = builder.costPercent;
            this.timeStamp = builder.timeStamp;
            this.timeType = builder.timeType;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SignRuleInfo create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return cost
         */
        public Integer getCost() {
            return this.cost;
        }

        /**
         * @return costPercent
         */
        public Integer getCostPercent() {
            return this.costPercent;
        }

        /**
         * @return timeStamp
         */
        public Integer getTimeStamp() {
            return this.timeStamp;
        }

        /**
         * @return timeType
         */
        public String getTimeType() {
            return this.timeType;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String content; 
            private Integer cost; 
            private Integer costPercent; 
            private Integer timeStamp; 
            private String timeType; 
            private String title; 

            /**
             * content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * cost.
             */
            public Builder cost(Integer cost) {
                this.cost = cost;
                return this;
            }

            /**
             * cost_percent.
             */
            public Builder costPercent(Integer costPercent) {
                this.costPercent = costPercent;
                return this;
            }

            /**
             * time_stamp.
             */
            public Builder timeStamp(Integer timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            /**
             * time_type.
             */
            public Builder timeType(String timeType) {
                this.timeType = timeType;
                return this;
            }

            /**
             * title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public SignRuleInfo build() {
                return new SignRuleInfo(this);
            } 

        } 

    }
    public static class SignRule extends TeaModel {
        @NameInMap("able")
        private Boolean able;

        @NameInMap("info")
        private java.util.List < SignRuleInfo> info;

        private SignRule(Builder builder) {
            this.able = builder.able;
            this.info = builder.info;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SignRule create() {
            return builder().build();
        }

        /**
         * @return able
         */
        public Boolean getAble() {
            return this.able;
        }

        /**
         * @return info
         */
        public java.util.List < SignRuleInfo> getInfo() {
            return this.info;
        }

        public static final class Builder {
            private Boolean able; 
            private java.util.List < SignRuleInfo> info; 

            /**
             * able.
             */
            public Builder able(Boolean able) {
                this.able = able;
                return this;
            }

            /**
             * info.
             */
            public Builder info(java.util.List < SignRuleInfo> info) {
                this.info = info;
                return this;
            }

            public SignRule build() {
                return new SignRule(this);
            } 

        } 

    }
    public static class UpgradeRuleInfo extends TeaModel {
        @NameInMap("content")
        private String content;

        @NameInMap("cost")
        private Integer cost;

        @NameInMap("cost_percent")
        private Integer costPercent;

        @NameInMap("time_stamp")
        private Integer timeStamp;

        @NameInMap("time_type")
        private String timeType;

        @NameInMap("title")
        private String title;

        private UpgradeRuleInfo(Builder builder) {
            this.content = builder.content;
            this.cost = builder.cost;
            this.costPercent = builder.costPercent;
            this.timeStamp = builder.timeStamp;
            this.timeType = builder.timeType;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UpgradeRuleInfo create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return cost
         */
        public Integer getCost() {
            return this.cost;
        }

        /**
         * @return costPercent
         */
        public Integer getCostPercent() {
            return this.costPercent;
        }

        /**
         * @return timeStamp
         */
        public Integer getTimeStamp() {
            return this.timeStamp;
        }

        /**
         * @return timeType
         */
        public String getTimeType() {
            return this.timeType;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String content; 
            private Integer cost; 
            private Integer costPercent; 
            private Integer timeStamp; 
            private String timeType; 
            private String title; 

            /**
             * content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * cost.
             */
            public Builder cost(Integer cost) {
                this.cost = cost;
                return this;
            }

            /**
             * cost_percent.
             */
            public Builder costPercent(Integer costPercent) {
                this.costPercent = costPercent;
                return this;
            }

            /**
             * time_stamp.
             */
            public Builder timeStamp(Integer timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            /**
             * time_type.
             */
            public Builder timeType(String timeType) {
                this.timeType = timeType;
                return this;
            }

            /**
             * title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public UpgradeRuleInfo build() {
                return new UpgradeRuleInfo(this);
            } 

        } 

    }
    public static class UpgradeRule extends TeaModel {
        @NameInMap("able")
        private Boolean able;

        @NameInMap("info")
        private java.util.List < UpgradeRuleInfo> info;

        private UpgradeRule(Builder builder) {
            this.able = builder.able;
            this.info = builder.info;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UpgradeRule create() {
            return builder().build();
        }

        /**
         * @return able
         */
        public Boolean getAble() {
            return this.able;
        }

        /**
         * @return info
         */
        public java.util.List < UpgradeRuleInfo> getInfo() {
            return this.info;
        }

        public static final class Builder {
            private Boolean able; 
            private java.util.List < UpgradeRuleInfo> info; 

            /**
             * able.
             */
            public Builder able(Boolean able) {
                this.able = able;
                return this;
            }

            /**
             * info.
             */
            public Builder info(java.util.List < UpgradeRuleInfo> info) {
                this.info = info;
                return this;
            }

            public UpgradeRule build() {
                return new UpgradeRule(this);
            } 

        } 

    }
    public static class FlightRuleList extends TeaModel {
        @NameInMap("baggage_info")
        private String baggageInfo;

        @NameInMap("baggage_item")
        private BaggageItem baggageItem;

        @NameInMap("change_rule")
        private ChangeRule changeRule;

        @NameInMap("change_rule_item")
        private ChangeRuleItem changeRuleItem;

        @NameInMap("extra")
        private String extra;

        @NameInMap("refund_rule")
        private RefundRule refundRule;

        @NameInMap("refund_rule_item")
        private RefundRuleItem refundRuleItem;

        @NameInMap("sign_rule")
        private SignRule signRule;

        @NameInMap("tuigaiqian_info")
        private String tuigaiqianInfo;

        @NameInMap("upgrade_rule")
        private UpgradeRule upgradeRule;

        private FlightRuleList(Builder builder) {
            this.baggageInfo = builder.baggageInfo;
            this.baggageItem = builder.baggageItem;
            this.changeRule = builder.changeRule;
            this.changeRuleItem = builder.changeRuleItem;
            this.extra = builder.extra;
            this.refundRule = builder.refundRule;
            this.refundRuleItem = builder.refundRuleItem;
            this.signRule = builder.signRule;
            this.tuigaiqianInfo = builder.tuigaiqianInfo;
            this.upgradeRule = builder.upgradeRule;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlightRuleList create() {
            return builder().build();
        }

        /**
         * @return baggageInfo
         */
        public String getBaggageInfo() {
            return this.baggageInfo;
        }

        /**
         * @return baggageItem
         */
        public BaggageItem getBaggageItem() {
            return this.baggageItem;
        }

        /**
         * @return changeRule
         */
        public ChangeRule getChangeRule() {
            return this.changeRule;
        }

        /**
         * @return changeRuleItem
         */
        public ChangeRuleItem getChangeRuleItem() {
            return this.changeRuleItem;
        }

        /**
         * @return extra
         */
        public String getExtra() {
            return this.extra;
        }

        /**
         * @return refundRule
         */
        public RefundRule getRefundRule() {
            return this.refundRule;
        }

        /**
         * @return refundRuleItem
         */
        public RefundRuleItem getRefundRuleItem() {
            return this.refundRuleItem;
        }

        /**
         * @return signRule
         */
        public SignRule getSignRule() {
            return this.signRule;
        }

        /**
         * @return tuigaiqianInfo
         */
        public String getTuigaiqianInfo() {
            return this.tuigaiqianInfo;
        }

        /**
         * @return upgradeRule
         */
        public UpgradeRule getUpgradeRule() {
            return this.upgradeRule;
        }

        public static final class Builder {
            private String baggageInfo; 
            private BaggageItem baggageItem; 
            private ChangeRule changeRule; 
            private ChangeRuleItem changeRuleItem; 
            private String extra; 
            private RefundRule refundRule; 
            private RefundRuleItem refundRuleItem; 
            private SignRule signRule; 
            private String tuigaiqianInfo; 
            private UpgradeRule upgradeRule; 

            /**
             * 行李额描述
             */
            public Builder baggageInfo(String baggageInfo) {
                this.baggageInfo = baggageInfo;
                return this;
            }

            /**
             * baggage_item.
             */
            public Builder baggageItem(BaggageItem baggageItem) {
                this.baggageItem = baggageItem;
                return this;
            }

            /**
             * 改签规则
             */
            public Builder changeRule(ChangeRule changeRule) {
                this.changeRule = changeRule;
                return this;
            }

            /**
             * change_rule_item.
             */
            public Builder changeRuleItem(ChangeRuleItem changeRuleItem) {
                this.changeRuleItem = changeRuleItem;
                return this;
            }

            /**
             * 额外信息
             */
            public Builder extra(String extra) {
                this.extra = extra;
                return this;
            }

            /**
             * 退票规则
             */
            public Builder refundRule(RefundRule refundRule) {
                this.refundRule = refundRule;
                return this;
            }

            /**
             * refund_rule_item.
             */
            public Builder refundRuleItem(RefundRuleItem refundRuleItem) {
                this.refundRuleItem = refundRuleItem;
                return this;
            }

            /**
             * 签转规则
             */
            public Builder signRule(SignRule signRule) {
                this.signRule = signRule;
                return this;
            }

            /**
             * 退改签描述
             */
            public Builder tuigaiqianInfo(String tuigaiqianInfo) {
                this.tuigaiqianInfo = tuigaiqianInfo;
                return this;
            }

            /**
             * 升舱规则
             */
            public Builder upgradeRule(UpgradeRule upgradeRule) {
                this.upgradeRule = upgradeRule;
                return this;
            }

            public FlightRuleList build() {
                return new FlightRuleList(this);
            } 

        } 

    }
    public static class CabinInfoList extends TeaModel {
        @NameInMap("agent_id")
        private Long agentId;

        @NameInMap("basic_cabin_price")
        private Integer basicCabinPrice;

        @NameInMap("build_price")
        private Integer buildPrice;

        @NameInMap("cabin")
        private String cabin;

        @NameInMap("cabin_class")
        private String cabinClass;

        @NameInMap("cabin_class_name")
        private String cabinClassName;

        @NameInMap("child_cabin")
        private String childCabin;

        @NameInMap("class_name")
        private String className;

        @NameInMap("class_rule")
        private String classRule;

        @NameInMap("discount")
        private String discount;

        @NameInMap("flight_rule_list")
        private java.util.List < FlightRuleList> flightRuleList;

        @NameInMap("flight_rule_list_str")
        private String flightRuleListStr;

        @NameInMap("invoice_type")
        private Integer invoiceType;

        @NameInMap("is_protocol")
        private Boolean isProtocol;

        @NameInMap("memo")
        private String memo;

        @NameInMap("oil_price")
        private Integer oilPrice;

        @NameInMap("order_params")
        private String orderParams;

        @NameInMap("ota_item_id")
        private String otaItemId;

        @NameInMap("price")
        private Integer price;

        @NameInMap("product_type")
        private Long productType;

        @NameInMap("product_type_desc")
        private String productTypeDesc;

        @NameInMap("promotion_price")
        private String promotionPrice;

        @NameInMap("remained_seat_count")
        private String remainedSeatCount;

        @NameInMap("ticket_price")
        private Integer ticketPrice;

        @NameInMap("total_price")
        private Integer totalPrice;

        private CabinInfoList(Builder builder) {
            this.agentId = builder.agentId;
            this.basicCabinPrice = builder.basicCabinPrice;
            this.buildPrice = builder.buildPrice;
            this.cabin = builder.cabin;
            this.cabinClass = builder.cabinClass;
            this.cabinClassName = builder.cabinClassName;
            this.childCabin = builder.childCabin;
            this.className = builder.className;
            this.classRule = builder.classRule;
            this.discount = builder.discount;
            this.flightRuleList = builder.flightRuleList;
            this.flightRuleListStr = builder.flightRuleListStr;
            this.invoiceType = builder.invoiceType;
            this.isProtocol = builder.isProtocol;
            this.memo = builder.memo;
            this.oilPrice = builder.oilPrice;
            this.orderParams = builder.orderParams;
            this.otaItemId = builder.otaItemId;
            this.price = builder.price;
            this.productType = builder.productType;
            this.productTypeDesc = builder.productTypeDesc;
            this.promotionPrice = builder.promotionPrice;
            this.remainedSeatCount = builder.remainedSeatCount;
            this.ticketPrice = builder.ticketPrice;
            this.totalPrice = builder.totalPrice;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CabinInfoList create() {
            return builder().build();
        }

        /**
         * @return agentId
         */
        public Long getAgentId() {
            return this.agentId;
        }

        /**
         * @return basicCabinPrice
         */
        public Integer getBasicCabinPrice() {
            return this.basicCabinPrice;
        }

        /**
         * @return buildPrice
         */
        public Integer getBuildPrice() {
            return this.buildPrice;
        }

        /**
         * @return cabin
         */
        public String getCabin() {
            return this.cabin;
        }

        /**
         * @return cabinClass
         */
        public String getCabinClass() {
            return this.cabinClass;
        }

        /**
         * @return cabinClassName
         */
        public String getCabinClassName() {
            return this.cabinClassName;
        }

        /**
         * @return childCabin
         */
        public String getChildCabin() {
            return this.childCabin;
        }

        /**
         * @return className
         */
        public String getClassName() {
            return this.className;
        }

        /**
         * @return classRule
         */
        public String getClassRule() {
            return this.classRule;
        }

        /**
         * @return discount
         */
        public String getDiscount() {
            return this.discount;
        }

        /**
         * @return flightRuleList
         */
        public java.util.List < FlightRuleList> getFlightRuleList() {
            return this.flightRuleList;
        }

        /**
         * @return flightRuleListStr
         */
        public String getFlightRuleListStr() {
            return this.flightRuleListStr;
        }

        /**
         * @return invoiceType
         */
        public Integer getInvoiceType() {
            return this.invoiceType;
        }

        /**
         * @return isProtocol
         */
        public Boolean getIsProtocol() {
            return this.isProtocol;
        }

        /**
         * @return memo
         */
        public String getMemo() {
            return this.memo;
        }

        /**
         * @return oilPrice
         */
        public Integer getOilPrice() {
            return this.oilPrice;
        }

        /**
         * @return orderParams
         */
        public String getOrderParams() {
            return this.orderParams;
        }

        /**
         * @return otaItemId
         */
        public String getOtaItemId() {
            return this.otaItemId;
        }

        /**
         * @return price
         */
        public Integer getPrice() {
            return this.price;
        }

        /**
         * @return productType
         */
        public Long getProductType() {
            return this.productType;
        }

        /**
         * @return productTypeDesc
         */
        public String getProductTypeDesc() {
            return this.productTypeDesc;
        }

        /**
         * @return promotionPrice
         */
        public String getPromotionPrice() {
            return this.promotionPrice;
        }

        /**
         * @return remainedSeatCount
         */
        public String getRemainedSeatCount() {
            return this.remainedSeatCount;
        }

        /**
         * @return ticketPrice
         */
        public Integer getTicketPrice() {
            return this.ticketPrice;
        }

        /**
         * @return totalPrice
         */
        public Integer getTotalPrice() {
            return this.totalPrice;
        }

        public static final class Builder {
            private Long agentId; 
            private Integer basicCabinPrice; 
            private Integer buildPrice; 
            private String cabin; 
            private String cabinClass; 
            private String cabinClassName; 
            private String childCabin; 
            private String className; 
            private String classRule; 
            private String discount; 
            private java.util.List < FlightRuleList> flightRuleList; 
            private String flightRuleListStr; 
            private Integer invoiceType; 
            private Boolean isProtocol; 
            private String memo; 
            private Integer oilPrice; 
            private String orderParams; 
            private String otaItemId; 
            private Integer price; 
            private Long productType; 
            private String productTypeDesc; 
            private String promotionPrice; 
            private String remainedSeatCount; 
            private Integer ticketPrice; 
            private Integer totalPrice; 

            /**
             * 代理人编号
             */
            public Builder agentId(Long agentId) {
                this.agentId = agentId;
                return this;
            }

            /**
             * 舱位基准价
             */
            public Builder basicCabinPrice(Integer basicCabinPrice) {
                this.basicCabinPrice = basicCabinPrice;
                return this;
            }

            /**
             * 基建
             */
            public Builder buildPrice(Integer buildPrice) {
                this.buildPrice = buildPrice;
                return this;
            }

            /**
             * 必填项,舱位代码
             */
            public Builder cabin(String cabin) {
                this.cabin = cabin;
                return this;
            }

            /**
             * 必填项,舱等
             */
            public Builder cabinClass(String cabinClass) {
                this.cabinClass = cabinClass;
                return this;
            }

            /**
             * 子舱位等级展示用名称，超级经济舱
             */
            public Builder cabinClassName(String cabinClassName) {
                this.cabinClassName = cabinClassName;
                return this;
            }

            /**
             * 必填项,子舱位代码
             */
            public Builder childCabin(String childCabin) {
                this.childCabin = childCabin;
                return this;
            }

            /**
             * 舱位名称，公务舱
             */
            public Builder className(String className) {
                this.className = className;
                return this;
            }

            /**
             * 退改签描述
             */
            public Builder classRule(String classRule) {
                this.classRule = classRule;
                return this;
            }

            /**
             * 必填项,折扣
             */
            public Builder discount(String discount) {
                this.discount = discount;
                return this;
            }

            /**
             * 退改签规则列表
             */
            public Builder flightRuleList(java.util.List < FlightRuleList> flightRuleList) {
                this.flightRuleList = flightRuleList;
                return this;
            }

            /**
             * 退改签规则列表json
             */
            public Builder flightRuleListStr(String flightRuleListStr) {
                this.flightRuleListStr = flightRuleListStr;
                return this;
            }

            /**
             * 行程单类型
             */
            public Builder invoiceType(Integer invoiceType) {
                this.invoiceType = invoiceType;
                return this;
            }

            /**
             * 是否协议价
             */
            public Builder isProtocol(Boolean isProtocol) {
                this.isProtocol = isProtocol;
                return this;
            }

            /**
             * memo.
             */
            public Builder memo(String memo) {
                this.memo = memo;
                return this;
            }

            /**
             * 燃油
             */
            public Builder oilPrice(Integer oilPrice) {
                this.oilPrice = oilPrice;
                return this;
            }

            /**
             * 加密参数,包含agentId 登下单需要用到的参数信息
             */
            public Builder orderParams(String orderParams) {
                this.orderParams = orderParams;
                return this;
            }

            /**
             * 商品id
             */
            public Builder otaItemId(String otaItemId) {
                this.otaItemId = otaItemId;
                return this;
            }

            /**
             * 必填项,销售票价（分）
             */
            public Builder price(Integer price) {
                this.price = price;
                return this;
            }

            /**
             * 产品类型
             */
            public Builder productType(Long productType) {
                this.productType = productType;
                return this;
            }

            /**
             * 标准/非标准产品
             */
            public Builder productTypeDesc(String productTypeDesc) {
                this.productTypeDesc = productTypeDesc;
                return this;
            }

            /**
             * 优惠价
             */
            public Builder promotionPrice(String promotionPrice) {
                this.promotionPrice = promotionPrice;
                return this;
            }

            /**
             * 必填项,剩余座位数
             */
            public Builder remainedSeatCount(String remainedSeatCount) {
                this.remainedSeatCount = remainedSeatCount;
                return this;
            }

            /**
             * 票面价
             */
            public Builder ticketPrice(Integer ticketPrice) {
                this.ticketPrice = ticketPrice;
                return this;
            }

            /**
             * 总价=销售价+基建+燃油费
             */
            public Builder totalPrice(Integer totalPrice) {
                this.totalPrice = totalPrice;
                return this;
            }

            public CabinInfoList build() {
                return new CabinInfoList(this);
            } 

        } 

    }
    public static class DepAirportInfo extends TeaModel {
        @NameInMap("airport_code")
        private String airportCode;

        @NameInMap("airport_name")
        private String airportName;

        @NameInMap("city_code")
        private String cityCode;

        @NameInMap("city_name")
        private String cityName;

        @NameInMap("terminal")
        private String terminal;

        private DepAirportInfo(Builder builder) {
            this.airportCode = builder.airportCode;
            this.airportName = builder.airportName;
            this.cityCode = builder.cityCode;
            this.cityName = builder.cityName;
            this.terminal = builder.terminal;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DepAirportInfo create() {
            return builder().build();
        }

        /**
         * @return airportCode
         */
        public String getAirportCode() {
            return this.airportCode;
        }

        /**
         * @return airportName
         */
        public String getAirportName() {
            return this.airportName;
        }

        /**
         * @return cityCode
         */
        public String getCityCode() {
            return this.cityCode;
        }

        /**
         * @return cityName
         */
        public String getCityName() {
            return this.cityName;
        }

        /**
         * @return terminal
         */
        public String getTerminal() {
            return this.terminal;
        }

        public static final class Builder {
            private String airportCode; 
            private String airportName; 
            private String cityCode; 
            private String cityName; 
            private String terminal; 

            /**
             * 必填项,机场编码
             */
            public Builder airportCode(String airportCode) {
                this.airportCode = airportCode;
                return this;
            }

            /**
             * 必填项,机场编码
             */
            public Builder airportName(String airportName) {
                this.airportName = airportName;
                return this;
            }

            /**
             * 必填项,城市编码
             */
            public Builder cityCode(String cityCode) {
                this.cityCode = cityCode;
                return this;
            }

            /**
             * 必填项,城市名称
             */
            public Builder cityName(String cityName) {
                this.cityName = cityName;
                return this;
            }

            /**
             * 必填项,航站楼
             */
            public Builder terminal(String terminal) {
                this.terminal = terminal;
                return this;
            }

            public DepAirportInfo build() {
                return new DepAirportInfo(this);
            } 

        } 

    }
    public static class BaggageSubContentVisualizesDescription extends TeaModel {
        @NameInMap("desc")
        private String desc;

        @NameInMap("icon")
        private String icon;

        @NameInMap("image")
        private String image;

        @NameInMap("title")
        private String title;

        private BaggageSubContentVisualizesDescription(Builder builder) {
            this.desc = builder.desc;
            this.icon = builder.icon;
            this.image = builder.image;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BaggageSubContentVisualizesDescription create() {
            return builder().build();
        }

        /**
         * @return desc
         */
        public String getDesc() {
            return this.desc;
        }

        /**
         * @return icon
         */
        public String getIcon() {
            return this.icon;
        }

        /**
         * @return image
         */
        public String getImage() {
            return this.image;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String desc; 
            private String icon; 
            private String image; 
            private String title; 

            /**
             * desc.
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * icon.
             */
            public Builder icon(String icon) {
                this.icon = icon;
                return this;
            }

            /**
             * image.
             */
            public Builder image(String image) {
                this.image = image;
                return this;
            }

            /**
             * title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public BaggageSubContentVisualizesDescription build() {
                return new BaggageSubContentVisualizesDescription(this);
            } 

        } 

    }
    public static class BaggageSubContentVisualizesImageDO extends TeaModel {
        @NameInMap("image")
        private String image;

        @NameInMap("largest")
        private String largest;

        @NameInMap("middle")
        private String middle;

        @NameInMap("smallest")
        private String smallest;

        private BaggageSubContentVisualizesImageDO(Builder builder) {
            this.image = builder.image;
            this.largest = builder.largest;
            this.middle = builder.middle;
            this.smallest = builder.smallest;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BaggageSubContentVisualizesImageDO create() {
            return builder().build();
        }

        /**
         * @return image
         */
        public String getImage() {
            return this.image;
        }

        /**
         * @return largest
         */
        public String getLargest() {
            return this.largest;
        }

        /**
         * @return middle
         */
        public String getMiddle() {
            return this.middle;
        }

        /**
         * @return smallest
         */
        public String getSmallest() {
            return this.smallest;
        }

        public static final class Builder {
            private String image; 
            private String largest; 
            private String middle; 
            private String smallest; 

            /**
             * image.
             */
            public Builder image(String image) {
                this.image = image;
                return this;
            }

            /**
             * largest.
             */
            public Builder largest(String largest) {
                this.largest = largest;
                return this;
            }

            /**
             * middle.
             */
            public Builder middle(String middle) {
                this.middle = middle;
                return this;
            }

            /**
             * smallest.
             */
            public Builder smallest(String smallest) {
                this.smallest = smallest;
                return this;
            }

            public BaggageSubContentVisualizesImageDO build() {
                return new BaggageSubContentVisualizesImageDO(this);
            } 

        } 

    }
    public static class BaggageSubItemsBaggageSubContentVisualizes extends TeaModel {
        @NameInMap("baggage_desc")
        private java.util.List < String > baggageDesc;

        @NameInMap("baggage_sub_content_type")
        private Integer baggageSubContentType;

        @NameInMap("description")
        private BaggageSubContentVisualizesDescription description;

        @NameInMap("image_d_o")
        private BaggageSubContentVisualizesImageDO imageDO;

        @NameInMap("is_highlight")
        private Boolean isHighlight;

        @NameInMap("sub_title")
        private String subTitle;

        private BaggageSubItemsBaggageSubContentVisualizes(Builder builder) {
            this.baggageDesc = builder.baggageDesc;
            this.baggageSubContentType = builder.baggageSubContentType;
            this.description = builder.description;
            this.imageDO = builder.imageDO;
            this.isHighlight = builder.isHighlight;
            this.subTitle = builder.subTitle;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BaggageSubItemsBaggageSubContentVisualizes create() {
            return builder().build();
        }

        /**
         * @return baggageDesc
         */
        public java.util.List < String > getBaggageDesc() {
            return this.baggageDesc;
        }

        /**
         * @return baggageSubContentType
         */
        public Integer getBaggageSubContentType() {
            return this.baggageSubContentType;
        }

        /**
         * @return description
         */
        public BaggageSubContentVisualizesDescription getDescription() {
            return this.description;
        }

        /**
         * @return imageDO
         */
        public BaggageSubContentVisualizesImageDO getImageDO() {
            return this.imageDO;
        }

        /**
         * @return isHighlight
         */
        public Boolean getIsHighlight() {
            return this.isHighlight;
        }

        /**
         * @return subTitle
         */
        public String getSubTitle() {
            return this.subTitle;
        }

        public static final class Builder {
            private java.util.List < String > baggageDesc; 
            private Integer baggageSubContentType; 
            private BaggageSubContentVisualizesDescription description; 
            private BaggageSubContentVisualizesImageDO imageDO; 
            private Boolean isHighlight; 
            private String subTitle; 

            /**
             * baggage_desc.
             */
            public Builder baggageDesc(java.util.List < String > baggageDesc) {
                this.baggageDesc = baggageDesc;
                return this;
            }

            /**
             * baggage_sub_content_type.
             */
            public Builder baggageSubContentType(Integer baggageSubContentType) {
                this.baggageSubContentType = baggageSubContentType;
                return this;
            }

            /**
             * desc : 您可以随身携带上飞机客舱内的行李物品，由旅客自行负责保管。具体尺寸、重量、类型等以各航空公司规定为准。
             */
            public Builder description(BaggageSubContentVisualizesDescription description) {
                this.description = description;
                return this;
            }

            /**
             * image : https://gw.alicdn.com/imgextra/i3/O1CN01kLt3m923XsUs6WVif_!!6000000007266-2-tps-280-300.png
             */
            public Builder imageDO(BaggageSubContentVisualizesImageDO imageDO) {
                this.imageDO = imageDO;
                return this;
            }

            /**
             * is_highlight.
             */
            public Builder isHighlight(Boolean isHighlight) {
                this.isHighlight = isHighlight;
                return this;
            }

            /**
             * sub_title.
             */
            public Builder subTitle(String subTitle) {
                this.subTitle = subTitle;
                return this;
            }

            public BaggageSubItemsBaggageSubContentVisualizes build() {
                return new BaggageSubItemsBaggageSubContentVisualizes(this);
            } 

        } 

    }
    public static class BaggageItemBaggageSubItems extends TeaModel {
        @NameInMap("baggage_sub_content_visualizes")
        private java.util.List < BaggageSubItemsBaggageSubContentVisualizes> baggageSubContentVisualizes;

        @NameInMap("extra_content_visualizes")
        private java.util.List < ? > extraContentVisualizes;

        @NameInMap("is_struct")
        private Boolean isStruct;

        @NameInMap("ptc")
        private String ptc;

        @NameInMap("title")
        private String title;

        private BaggageItemBaggageSubItems(Builder builder) {
            this.baggageSubContentVisualizes = builder.baggageSubContentVisualizes;
            this.extraContentVisualizes = builder.extraContentVisualizes;
            this.isStruct = builder.isStruct;
            this.ptc = builder.ptc;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BaggageItemBaggageSubItems create() {
            return builder().build();
        }

        /**
         * @return baggageSubContentVisualizes
         */
        public java.util.List < BaggageSubItemsBaggageSubContentVisualizes> getBaggageSubContentVisualizes() {
            return this.baggageSubContentVisualizes;
        }

        /**
         * @return extraContentVisualizes
         */
        public java.util.List < ? > getExtraContentVisualizes() {
            return this.extraContentVisualizes;
        }

        /**
         * @return isStruct
         */
        public Boolean getIsStruct() {
            return this.isStruct;
        }

        /**
         * @return ptc
         */
        public String getPtc() {
            return this.ptc;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private java.util.List < BaggageSubItemsBaggageSubContentVisualizes> baggageSubContentVisualizes; 
            private java.util.List < ? > extraContentVisualizes; 
            private Boolean isStruct; 
            private String ptc; 
            private String title; 

            /**
             * baggageDesc : ["每人可携带 1件 登机","至多 5公斤/件","尺寸不超过 20*40*55cm"]
             */
            public Builder baggageSubContentVisualizes(java.util.List < BaggageSubItemsBaggageSubContentVisualizes> baggageSubContentVisualizes) {
                this.baggageSubContentVisualizes = baggageSubContentVisualizes;
                return this;
            }

            /**
             * extra_content_visualizes.
             */
            public Builder extraContentVisualizes(java.util.List < ? > extraContentVisualizes) {
                this.extraContentVisualizes = extraContentVisualizes;
                return this;
            }

            /**
             * baggageSubContentVisualizes : [
             */
            public Builder isStruct(Boolean isStruct) {
                this.isStruct = isStruct;
                return this;
            }

            /**
             * PTC
             */
            public Builder ptc(String ptc) {
                this.ptc = ptc;
                return this;
            }

            /**
             * title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public BaggageItemBaggageSubItems build() {
                return new BaggageItemBaggageSubItems(this);
            } 

        } 

    }
    public static class BaggageItemTips extends TeaModel {
        @NameInMap("logo")
        private String logo;

        @NameInMap("tips_desc")
        private String tipsDesc;

        @NameInMap("tips_image")
        private String tipsImage;

        private BaggageItemTips(Builder builder) {
            this.logo = builder.logo;
            this.tipsDesc = builder.tipsDesc;
            this.tipsImage = builder.tipsImage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BaggageItemTips create() {
            return builder().build();
        }

        /**
         * @return logo
         */
        public String getLogo() {
            return this.logo;
        }

        /**
         * @return tipsDesc
         */
        public String getTipsDesc() {
            return this.tipsDesc;
        }

        /**
         * @return tipsImage
         */
        public String getTipsImage() {
            return this.tipsImage;
        }

        public static final class Builder {
            private String logo; 
            private String tipsDesc; 
            private String tipsImage; 

            /**
             * logo.
             */
            public Builder logo(String logo) {
                this.logo = logo;
                return this;
            }

            /**
             * tips_desc.
             */
            public Builder tipsDesc(String tipsDesc) {
                this.tipsDesc = tipsDesc;
                return this;
            }

            /**
             * tips_image.
             */
            public Builder tipsImage(String tipsImage) {
                this.tipsImage = tipsImage;
                return this;
            }

            public BaggageItemTips build() {
                return new BaggageItemTips(this);
            } 

        } 

    }
    public static class FlightRuleListBaggageItem extends TeaModel {
        @NameInMap("baggage_sub_items")
        private java.util.List < BaggageItemBaggageSubItems> baggageSubItems;

        @NameInMap("index")
        private Integer index;

        @NameInMap("table_head")
        private String tableHead;

        @NameInMap("tips")
        private BaggageItemTips tips;

        @NameInMap("title")
        private String title;

        @NameInMap("type")
        private Integer type;

        private FlightRuleListBaggageItem(Builder builder) {
            this.baggageSubItems = builder.baggageSubItems;
            this.index = builder.index;
            this.tableHead = builder.tableHead;
            this.tips = builder.tips;
            this.title = builder.title;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlightRuleListBaggageItem create() {
            return builder().build();
        }

        /**
         * @return baggageSubItems
         */
        public java.util.List < BaggageItemBaggageSubItems> getBaggageSubItems() {
            return this.baggageSubItems;
        }

        /**
         * @return index
         */
        public Integer getIndex() {
            return this.index;
        }

        /**
         * @return tableHead
         */
        public String getTableHead() {
            return this.tableHead;
        }

        /**
         * @return tips
         */
        public BaggageItemTips getTips() {
            return this.tips;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        public static final class Builder {
            private java.util.List < BaggageItemBaggageSubItems> baggageSubItems; 
            private Integer index; 
            private String tableHead; 
            private BaggageItemTips tips; 
            private String title; 
            private Integer type; 

            /**
             * baggage_sub_items.
             */
            public Builder baggageSubItems(java.util.List < BaggageItemBaggageSubItems> baggageSubItems) {
                this.baggageSubItems = baggageSubItems;
                return this;
            }

            /**
             * baggageSubItems : [
             */
            public Builder index(Integer index) {
                this.index = index;
                return this;
            }

            /**
             * table_head.
             */
            public Builder tableHead(String tableHead) {
                this.tableHead = tableHead;
                return this;
            }

            /**
             * logo : https://gw.alicdn.com/imgextra/i1/O1CN019zl3WZ22fNLxzx2cR_!!6000000007147-2-tps-125-45.png
             */
            public Builder tips(BaggageItemTips tips) {
                this.tips = tips;
                return this;
            }

            /**
             * title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * type.
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            public FlightRuleListBaggageItem build() {
                return new FlightRuleListBaggageItem(this);
            } 

        } 

    }
    public static class ChangeRuleInfo extends TeaModel {
        @NameInMap("content")
        private String content;

        @NameInMap("cost")
        private Integer cost;

        @NameInMap("cost_percent")
        private Integer costPercent;

        @NameInMap("time_stamp")
        private Integer timeStamp;

        @NameInMap("time_type")
        private String timeType;

        @NameInMap("title")
        private String title;

        private ChangeRuleInfo(Builder builder) {
            this.content = builder.content;
            this.cost = builder.cost;
            this.costPercent = builder.costPercent;
            this.timeStamp = builder.timeStamp;
            this.timeType = builder.timeType;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ChangeRuleInfo create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return cost
         */
        public Integer getCost() {
            return this.cost;
        }

        /**
         * @return costPercent
         */
        public Integer getCostPercent() {
            return this.costPercent;
        }

        /**
         * @return timeStamp
         */
        public Integer getTimeStamp() {
            return this.timeStamp;
        }

        /**
         * @return timeType
         */
        public String getTimeType() {
            return this.timeType;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String content; 
            private Integer cost; 
            private Integer costPercent; 
            private Integer timeStamp; 
            private String timeType; 
            private String title; 

            /**
             * content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * cost.
             */
            public Builder cost(Integer cost) {
                this.cost = cost;
                return this;
            }

            /**
             * cost_percent.
             */
            public Builder costPercent(Integer costPercent) {
                this.costPercent = costPercent;
                return this;
            }

            /**
             * time_stamp.
             */
            public Builder timeStamp(Integer timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            /**
             * time_type.
             */
            public Builder timeType(String timeType) {
                this.timeType = timeType;
                return this;
            }

            /**
             * title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public ChangeRuleInfo build() {
                return new ChangeRuleInfo(this);
            } 

        } 

    }
    public static class FlightRuleListChangeRule extends TeaModel {
        @NameInMap("able")
        private Boolean able;

        @NameInMap("info")
        private java.util.List < ChangeRuleInfo> info;

        private FlightRuleListChangeRule(Builder builder) {
            this.able = builder.able;
            this.info = builder.info;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlightRuleListChangeRule create() {
            return builder().build();
        }

        /**
         * @return able
         */
        public Boolean getAble() {
            return this.able;
        }

        /**
         * @return info
         */
        public java.util.List < ChangeRuleInfo> getInfo() {
            return this.info;
        }

        public static final class Builder {
            private Boolean able; 
            private java.util.List < ChangeRuleInfo> info; 

            /**
             * able.
             */
            public Builder able(Boolean able) {
                this.able = able;
                return this;
            }

            /**
             * info.
             */
            public Builder info(java.util.List < ChangeRuleInfo> info) {
                this.info = info;
                return this;
            }

            public FlightRuleListChangeRule build() {
                return new FlightRuleListChangeRule(this);
            } 

        } 

    }
    public static class ChangeRuleItemExtraContents extends TeaModel {
        @NameInMap("content")
        private String content;

        @NameInMap("title")
        private String title;

        private ChangeRuleItemExtraContents(Builder builder) {
            this.content = builder.content;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ChangeRuleItemExtraContents create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String content; 
            private String title; 

            /**
             * content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public ChangeRuleItemExtraContents build() {
                return new ChangeRuleItemExtraContents(this);
            } 

        } 

    }
    public static class ChangeRuleItemRefundSubItemsRefundSubContents extends TeaModel {
        @NameInMap("fee_desc")
        private String feeDesc;

        @NameInMap("fee_range")
        private String feeRange;

        @NameInMap("style")
        private Integer style;

        private ChangeRuleItemRefundSubItemsRefundSubContents(Builder builder) {
            this.feeDesc = builder.feeDesc;
            this.feeRange = builder.feeRange;
            this.style = builder.style;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ChangeRuleItemRefundSubItemsRefundSubContents create() {
            return builder().build();
        }

        /**
         * @return feeDesc
         */
        public String getFeeDesc() {
            return this.feeDesc;
        }

        /**
         * @return feeRange
         */
        public String getFeeRange() {
            return this.feeRange;
        }

        /**
         * @return style
         */
        public Integer getStyle() {
            return this.style;
        }

        public static final class Builder {
            private String feeDesc; 
            private String feeRange; 
            private Integer style; 

            /**
             * fee_desc.
             */
            public Builder feeDesc(String feeDesc) {
                this.feeDesc = feeDesc;
                return this;
            }

            /**
             * fee_range.
             */
            public Builder feeRange(String feeRange) {
                this.feeRange = feeRange;
                return this;
            }

            /**
             * style.
             */
            public Builder style(Integer style) {
                this.style = style;
                return this;
            }

            public ChangeRuleItemRefundSubItemsRefundSubContents build() {
                return new ChangeRuleItemRefundSubItemsRefundSubContents(this);
            } 

        } 

    }
    public static class ChangeRuleItemRefundSubItems extends TeaModel {
        @NameInMap("is_struct")
        private Boolean isStruct;

        @NameInMap("ptc")
        private String ptc;

        @NameInMap("refund_sub_contents")
        private java.util.List < ChangeRuleItemRefundSubItemsRefundSubContents> refundSubContents;

        @NameInMap("title")
        private String title;

        private ChangeRuleItemRefundSubItems(Builder builder) {
            this.isStruct = builder.isStruct;
            this.ptc = builder.ptc;
            this.refundSubContents = builder.refundSubContents;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ChangeRuleItemRefundSubItems create() {
            return builder().build();
        }

        /**
         * @return isStruct
         */
        public Boolean getIsStruct() {
            return this.isStruct;
        }

        /**
         * @return ptc
         */
        public String getPtc() {
            return this.ptc;
        }

        /**
         * @return refundSubContents
         */
        public java.util.List < ChangeRuleItemRefundSubItemsRefundSubContents> getRefundSubContents() {
            return this.refundSubContents;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private Boolean isStruct; 
            private String ptc; 
            private java.util.List < ChangeRuleItemRefundSubItemsRefundSubContents> refundSubContents; 
            private String title; 

            /**
             * isStruct : true
             */
            public Builder isStruct(Boolean isStruct) {
                this.isStruct = isStruct;
                return this;
            }

            /**
             * PTC
             */
            public Builder ptc(String ptc) {
                this.ptc = ptc;
                return this;
            }

            /**
             * feeDesc : ￥156/人
             */
            public Builder refundSubContents(java.util.List < ChangeRuleItemRefundSubItemsRefundSubContents> refundSubContents) {
                this.refundSubContents = refundSubContents;
                return this;
            }

            /**
             * title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public ChangeRuleItemRefundSubItems build() {
                return new ChangeRuleItemRefundSubItems(this);
            } 

        } 

    }
    public static class FlightRuleListChangeRuleItem extends TeaModel {
        @NameInMap("extra_contents")
        private java.util.List < ChangeRuleItemExtraContents> extraContents;

        @NameInMap("index")
        private Integer index;

        @NameInMap("refund_sub_items")
        private java.util.List < ChangeRuleItemRefundSubItems> refundSubItems;

        @NameInMap("sub_table_head")
        private java.util.List < String > subTableHead;

        @NameInMap("table_head")
        private String tableHead;

        @NameInMap("title")
        private String title;

        @NameInMap("type")
        private Integer type;

        private FlightRuleListChangeRuleItem(Builder builder) {
            this.extraContents = builder.extraContents;
            this.index = builder.index;
            this.refundSubItems = builder.refundSubItems;
            this.subTableHead = builder.subTableHead;
            this.tableHead = builder.tableHead;
            this.title = builder.title;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlightRuleListChangeRuleItem create() {
            return builder().build();
        }

        /**
         * @return extraContents
         */
        public java.util.List < ChangeRuleItemExtraContents> getExtraContents() {
            return this.extraContents;
        }

        /**
         * @return index
         */
        public Integer getIndex() {
            return this.index;
        }

        /**
         * @return refundSubItems
         */
        public java.util.List < ChangeRuleItemRefundSubItems> getRefundSubItems() {
            return this.refundSubItems;
        }

        /**
         * @return subTableHead
         */
        public java.util.List < String > getSubTableHead() {
            return this.subTableHead;
        }

        /**
         * @return tableHead
         */
        public String getTableHead() {
            return this.tableHead;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        public static final class Builder {
            private java.util.List < ChangeRuleItemExtraContents> extraContents; 
            private Integer index; 
            private java.util.List < ChangeRuleItemRefundSubItems> refundSubItems; 
            private java.util.List < String > subTableHead; 
            private String tableHead; 
            private String title; 
            private Integer type; 

            /**
             * content : 不可签转
             */
            public Builder extraContents(java.util.List < ChangeRuleItemExtraContents> extraContents) {
                this.extraContents = extraContents;
                return this;
            }

            /**
             * extraContents : [
             */
            public Builder index(Integer index) {
                this.index = index;
                return this;
            }

            /**
             * refund_sub_items.
             */
            public Builder refundSubItems(java.util.List < ChangeRuleItemRefundSubItems> refundSubItems) {
                this.refundSubItems = refundSubItems;
                return this;
            }

            /**
             * sub_table_head.
             */
            public Builder subTableHead(java.util.List < String > subTableHead) {
                this.subTableHead = subTableHead;
                return this;
            }

            /**
             * table_head.
             */
            public Builder tableHead(String tableHead) {
                this.tableHead = tableHead;
                return this;
            }

            /**
             * title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * type.
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            public FlightRuleListChangeRuleItem build() {
                return new FlightRuleListChangeRuleItem(this);
            } 

        } 

    }
    public static class FlightRuleListRefundRuleInfo extends TeaModel {
        @NameInMap("content")
        private String content;

        @NameInMap("cost")
        private Integer cost;

        @NameInMap("cost_percent")
        private Integer costPercent;

        @NameInMap("time_stamp")
        private Integer timeStamp;

        @NameInMap("time_type")
        private String timeType;

        @NameInMap("title")
        private String title;

        private FlightRuleListRefundRuleInfo(Builder builder) {
            this.content = builder.content;
            this.cost = builder.cost;
            this.costPercent = builder.costPercent;
            this.timeStamp = builder.timeStamp;
            this.timeType = builder.timeType;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlightRuleListRefundRuleInfo create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return cost
         */
        public Integer getCost() {
            return this.cost;
        }

        /**
         * @return costPercent
         */
        public Integer getCostPercent() {
            return this.costPercent;
        }

        /**
         * @return timeStamp
         */
        public Integer getTimeStamp() {
            return this.timeStamp;
        }

        /**
         * @return timeType
         */
        public String getTimeType() {
            return this.timeType;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String content; 
            private Integer cost; 
            private Integer costPercent; 
            private Integer timeStamp; 
            private String timeType; 
            private String title; 

            /**
             * content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * cost.
             */
            public Builder cost(Integer cost) {
                this.cost = cost;
                return this;
            }

            /**
             * cost_percent.
             */
            public Builder costPercent(Integer costPercent) {
                this.costPercent = costPercent;
                return this;
            }

            /**
             * time_stamp.
             */
            public Builder timeStamp(Integer timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            /**
             * time_type.
             */
            public Builder timeType(String timeType) {
                this.timeType = timeType;
                return this;
            }

            /**
             * title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public FlightRuleListRefundRuleInfo build() {
                return new FlightRuleListRefundRuleInfo(this);
            } 

        } 

    }
    public static class FlightRuleListRefundRule extends TeaModel {
        @NameInMap("able")
        private Boolean able;

        @NameInMap("info")
        private java.util.List < FlightRuleListRefundRuleInfo> info;

        private FlightRuleListRefundRule(Builder builder) {
            this.able = builder.able;
            this.info = builder.info;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlightRuleListRefundRule create() {
            return builder().build();
        }

        /**
         * @return able
         */
        public Boolean getAble() {
            return this.able;
        }

        /**
         * @return info
         */
        public java.util.List < FlightRuleListRefundRuleInfo> getInfo() {
            return this.info;
        }

        public static final class Builder {
            private Boolean able; 
            private java.util.List < FlightRuleListRefundRuleInfo> info; 

            /**
             * able.
             */
            public Builder able(Boolean able) {
                this.able = able;
                return this;
            }

            /**
             * info.
             */
            public Builder info(java.util.List < FlightRuleListRefundRuleInfo> info) {
                this.info = info;
                return this;
            }

            public FlightRuleListRefundRule build() {
                return new FlightRuleListRefundRule(this);
            } 

        } 

    }
    public static class FlightRuleListRefundRuleItemExtraContents extends TeaModel {
        @NameInMap("content")
        private String content;

        @NameInMap("title")
        private String title;

        private FlightRuleListRefundRuleItemExtraContents(Builder builder) {
            this.content = builder.content;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlightRuleListRefundRuleItemExtraContents create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String content; 
            private String title; 

            /**
             * content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public FlightRuleListRefundRuleItemExtraContents build() {
                return new FlightRuleListRefundRuleItemExtraContents(this);
            } 

        } 

    }
    public static class RefundRuleItemRefundSubItemsRefundSubContents extends TeaModel {
        @NameInMap("fee_desc")
        private String feeDesc;

        @NameInMap("fee_range")
        private String feeRange;

        @NameInMap("style")
        private Integer style;

        private RefundRuleItemRefundSubItemsRefundSubContents(Builder builder) {
            this.feeDesc = builder.feeDesc;
            this.feeRange = builder.feeRange;
            this.style = builder.style;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RefundRuleItemRefundSubItemsRefundSubContents create() {
            return builder().build();
        }

        /**
         * @return feeDesc
         */
        public String getFeeDesc() {
            return this.feeDesc;
        }

        /**
         * @return feeRange
         */
        public String getFeeRange() {
            return this.feeRange;
        }

        /**
         * @return style
         */
        public Integer getStyle() {
            return this.style;
        }

        public static final class Builder {
            private String feeDesc; 
            private String feeRange; 
            private Integer style; 

            /**
             * fee_desc.
             */
            public Builder feeDesc(String feeDesc) {
                this.feeDesc = feeDesc;
                return this;
            }

            /**
             * fee_range.
             */
            public Builder feeRange(String feeRange) {
                this.feeRange = feeRange;
                return this;
            }

            /**
             * style.
             */
            public Builder style(Integer style) {
                this.style = style;
                return this;
            }

            public RefundRuleItemRefundSubItemsRefundSubContents build() {
                return new RefundRuleItemRefundSubItemsRefundSubContents(this);
            } 

        } 

    }
    public static class FlightRuleListRefundRuleItemRefundSubItems extends TeaModel {
        @NameInMap("is_struct")
        private Boolean isStruct;

        @NameInMap("ptc")
        private String ptc;

        @NameInMap("refund_sub_contents")
        private java.util.List < RefundRuleItemRefundSubItemsRefundSubContents> refundSubContents;

        @NameInMap("title")
        private String title;

        private FlightRuleListRefundRuleItemRefundSubItems(Builder builder) {
            this.isStruct = builder.isStruct;
            this.ptc = builder.ptc;
            this.refundSubContents = builder.refundSubContents;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlightRuleListRefundRuleItemRefundSubItems create() {
            return builder().build();
        }

        /**
         * @return isStruct
         */
        public Boolean getIsStruct() {
            return this.isStruct;
        }

        /**
         * @return ptc
         */
        public String getPtc() {
            return this.ptc;
        }

        /**
         * @return refundSubContents
         */
        public java.util.List < RefundRuleItemRefundSubItemsRefundSubContents> getRefundSubContents() {
            return this.refundSubContents;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private Boolean isStruct; 
            private String ptc; 
            private java.util.List < RefundRuleItemRefundSubItemsRefundSubContents> refundSubContents; 
            private String title; 

            /**
             * isStruct : true
             */
            public Builder isStruct(Boolean isStruct) {
                this.isStruct = isStruct;
                return this;
            }

            /**
             * PTC
             */
            public Builder ptc(String ptc) {
                this.ptc = ptc;
                return this;
            }

            /**
             * feeDesc : ￥156/人
             */
            public Builder refundSubContents(java.util.List < RefundRuleItemRefundSubItemsRefundSubContents> refundSubContents) {
                this.refundSubContents = refundSubContents;
                return this;
            }

            /**
             * title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public FlightRuleListRefundRuleItemRefundSubItems build() {
                return new FlightRuleListRefundRuleItemRefundSubItems(this);
            } 

        } 

    }
    public static class FlightRuleListRefundRuleItem extends TeaModel {
        @NameInMap("extra_contents")
        private java.util.List < FlightRuleListRefundRuleItemExtraContents> extraContents;

        @NameInMap("index")
        private Integer index;

        @NameInMap("refund_sub_items")
        private java.util.List < FlightRuleListRefundRuleItemRefundSubItems> refundSubItems;

        @NameInMap("sub_table_head")
        private java.util.List < String > subTableHead;

        @NameInMap("table_head")
        private String tableHead;

        @NameInMap("title")
        private String title;

        @NameInMap("type")
        private Integer type;

        private FlightRuleListRefundRuleItem(Builder builder) {
            this.extraContents = builder.extraContents;
            this.index = builder.index;
            this.refundSubItems = builder.refundSubItems;
            this.subTableHead = builder.subTableHead;
            this.tableHead = builder.tableHead;
            this.title = builder.title;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlightRuleListRefundRuleItem create() {
            return builder().build();
        }

        /**
         * @return extraContents
         */
        public java.util.List < FlightRuleListRefundRuleItemExtraContents> getExtraContents() {
            return this.extraContents;
        }

        /**
         * @return index
         */
        public Integer getIndex() {
            return this.index;
        }

        /**
         * @return refundSubItems
         */
        public java.util.List < FlightRuleListRefundRuleItemRefundSubItems> getRefundSubItems() {
            return this.refundSubItems;
        }

        /**
         * @return subTableHead
         */
        public java.util.List < String > getSubTableHead() {
            return this.subTableHead;
        }

        /**
         * @return tableHead
         */
        public String getTableHead() {
            return this.tableHead;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        public static final class Builder {
            private java.util.List < FlightRuleListRefundRuleItemExtraContents> extraContents; 
            private Integer index; 
            private java.util.List < FlightRuleListRefundRuleItemRefundSubItems> refundSubItems; 
            private java.util.List < String > subTableHead; 
            private String tableHead; 
            private String title; 
            private Integer type; 

            /**
             * content : 不可签转
             */
            public Builder extraContents(java.util.List < FlightRuleListRefundRuleItemExtraContents> extraContents) {
                this.extraContents = extraContents;
                return this;
            }

            /**
             * extraContents : [
             */
            public Builder index(Integer index) {
                this.index = index;
                return this;
            }

            /**
             * refund_sub_items.
             */
            public Builder refundSubItems(java.util.List < FlightRuleListRefundRuleItemRefundSubItems> refundSubItems) {
                this.refundSubItems = refundSubItems;
                return this;
            }

            /**
             * sub_table_head.
             */
            public Builder subTableHead(java.util.List < String > subTableHead) {
                this.subTableHead = subTableHead;
                return this;
            }

            /**
             * table_head.
             */
            public Builder tableHead(String tableHead) {
                this.tableHead = tableHead;
                return this;
            }

            /**
             * title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * type.
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            public FlightRuleListRefundRuleItem build() {
                return new FlightRuleListRefundRuleItem(this);
            } 

        } 

    }
    public static class FlightRuleListSignRuleInfo extends TeaModel {
        @NameInMap("content")
        private String content;

        @NameInMap("cost")
        private Integer cost;

        @NameInMap("cost_percent")
        private Integer costPercent;

        @NameInMap("time_stamp")
        private Integer timeStamp;

        @NameInMap("time_type")
        private String timeType;

        @NameInMap("title")
        private String title;

        private FlightRuleListSignRuleInfo(Builder builder) {
            this.content = builder.content;
            this.cost = builder.cost;
            this.costPercent = builder.costPercent;
            this.timeStamp = builder.timeStamp;
            this.timeType = builder.timeType;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlightRuleListSignRuleInfo create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return cost
         */
        public Integer getCost() {
            return this.cost;
        }

        /**
         * @return costPercent
         */
        public Integer getCostPercent() {
            return this.costPercent;
        }

        /**
         * @return timeStamp
         */
        public Integer getTimeStamp() {
            return this.timeStamp;
        }

        /**
         * @return timeType
         */
        public String getTimeType() {
            return this.timeType;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String content; 
            private Integer cost; 
            private Integer costPercent; 
            private Integer timeStamp; 
            private String timeType; 
            private String title; 

            /**
             * content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * cost.
             */
            public Builder cost(Integer cost) {
                this.cost = cost;
                return this;
            }

            /**
             * cost_percent.
             */
            public Builder costPercent(Integer costPercent) {
                this.costPercent = costPercent;
                return this;
            }

            /**
             * time_stamp.
             */
            public Builder timeStamp(Integer timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            /**
             * time_type.
             */
            public Builder timeType(String timeType) {
                this.timeType = timeType;
                return this;
            }

            /**
             * title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public FlightRuleListSignRuleInfo build() {
                return new FlightRuleListSignRuleInfo(this);
            } 

        } 

    }
    public static class FlightRuleListSignRule extends TeaModel {
        @NameInMap("able")
        private Boolean able;

        @NameInMap("info")
        private java.util.List < FlightRuleListSignRuleInfo> info;

        private FlightRuleListSignRule(Builder builder) {
            this.able = builder.able;
            this.info = builder.info;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlightRuleListSignRule create() {
            return builder().build();
        }

        /**
         * @return able
         */
        public Boolean getAble() {
            return this.able;
        }

        /**
         * @return info
         */
        public java.util.List < FlightRuleListSignRuleInfo> getInfo() {
            return this.info;
        }

        public static final class Builder {
            private Boolean able; 
            private java.util.List < FlightRuleListSignRuleInfo> info; 

            /**
             * able.
             */
            public Builder able(Boolean able) {
                this.able = able;
                return this;
            }

            /**
             * info.
             */
            public Builder info(java.util.List < FlightRuleListSignRuleInfo> info) {
                this.info = info;
                return this;
            }

            public FlightRuleListSignRule build() {
                return new FlightRuleListSignRule(this);
            } 

        } 

    }
    public static class FlightRuleListUpgradeRuleInfo extends TeaModel {
        @NameInMap("content")
        private String content;

        @NameInMap("cost")
        private Integer cost;

        @NameInMap("cost_percent")
        private Integer costPercent;

        @NameInMap("time_stamp")
        private Integer timeStamp;

        @NameInMap("time_type")
        private String timeType;

        @NameInMap("title")
        private String title;

        private FlightRuleListUpgradeRuleInfo(Builder builder) {
            this.content = builder.content;
            this.cost = builder.cost;
            this.costPercent = builder.costPercent;
            this.timeStamp = builder.timeStamp;
            this.timeType = builder.timeType;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlightRuleListUpgradeRuleInfo create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return cost
         */
        public Integer getCost() {
            return this.cost;
        }

        /**
         * @return costPercent
         */
        public Integer getCostPercent() {
            return this.costPercent;
        }

        /**
         * @return timeStamp
         */
        public Integer getTimeStamp() {
            return this.timeStamp;
        }

        /**
         * @return timeType
         */
        public String getTimeType() {
            return this.timeType;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String content; 
            private Integer cost; 
            private Integer costPercent; 
            private Integer timeStamp; 
            private String timeType; 
            private String title; 

            /**
             * content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * cost.
             */
            public Builder cost(Integer cost) {
                this.cost = cost;
                return this;
            }

            /**
             * cost_percent.
             */
            public Builder costPercent(Integer costPercent) {
                this.costPercent = costPercent;
                return this;
            }

            /**
             * time_stamp.
             */
            public Builder timeStamp(Integer timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            /**
             * time_type.
             */
            public Builder timeType(String timeType) {
                this.timeType = timeType;
                return this;
            }

            /**
             * title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public FlightRuleListUpgradeRuleInfo build() {
                return new FlightRuleListUpgradeRuleInfo(this);
            } 

        } 

    }
    public static class FlightRuleListUpgradeRule extends TeaModel {
        @NameInMap("able")
        private Boolean able;

        @NameInMap("info")
        private java.util.List < FlightRuleListUpgradeRuleInfo> info;

        private FlightRuleListUpgradeRule(Builder builder) {
            this.able = builder.able;
            this.info = builder.info;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlightRuleListUpgradeRule create() {
            return builder().build();
        }

        /**
         * @return able
         */
        public Boolean getAble() {
            return this.able;
        }

        /**
         * @return info
         */
        public java.util.List < FlightRuleListUpgradeRuleInfo> getInfo() {
            return this.info;
        }

        public static final class Builder {
            private Boolean able; 
            private java.util.List < FlightRuleListUpgradeRuleInfo> info; 

            /**
             * able.
             */
            public Builder able(Boolean able) {
                this.able = able;
                return this;
            }

            /**
             * info.
             */
            public Builder info(java.util.List < FlightRuleListUpgradeRuleInfo> info) {
                this.info = info;
                return this;
            }

            public FlightRuleListUpgradeRule build() {
                return new FlightRuleListUpgradeRule(this);
            } 

        } 

    }
    public static class FlightListFlightRuleList extends TeaModel {
        @NameInMap("baggage_info")
        private String baggageInfo;

        @NameInMap("baggage_item")
        private FlightRuleListBaggageItem baggageItem;

        @NameInMap("change_rule")
        private FlightRuleListChangeRule changeRule;

        @NameInMap("change_rule_item")
        private FlightRuleListChangeRuleItem changeRuleItem;

        @NameInMap("extra")
        private String extra;

        @NameInMap("refund_rule")
        private FlightRuleListRefundRule refundRule;

        @NameInMap("refund_rule_item")
        private FlightRuleListRefundRuleItem refundRuleItem;

        @NameInMap("sign_rule")
        private FlightRuleListSignRule signRule;

        @NameInMap("tuigaiqian_info")
        private String tuigaiqianInfo;

        @NameInMap("upgrade_rule")
        private FlightRuleListUpgradeRule upgradeRule;

        private FlightListFlightRuleList(Builder builder) {
            this.baggageInfo = builder.baggageInfo;
            this.baggageItem = builder.baggageItem;
            this.changeRule = builder.changeRule;
            this.changeRuleItem = builder.changeRuleItem;
            this.extra = builder.extra;
            this.refundRule = builder.refundRule;
            this.refundRuleItem = builder.refundRuleItem;
            this.signRule = builder.signRule;
            this.tuigaiqianInfo = builder.tuigaiqianInfo;
            this.upgradeRule = builder.upgradeRule;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlightListFlightRuleList create() {
            return builder().build();
        }

        /**
         * @return baggageInfo
         */
        public String getBaggageInfo() {
            return this.baggageInfo;
        }

        /**
         * @return baggageItem
         */
        public FlightRuleListBaggageItem getBaggageItem() {
            return this.baggageItem;
        }

        /**
         * @return changeRule
         */
        public FlightRuleListChangeRule getChangeRule() {
            return this.changeRule;
        }

        /**
         * @return changeRuleItem
         */
        public FlightRuleListChangeRuleItem getChangeRuleItem() {
            return this.changeRuleItem;
        }

        /**
         * @return extra
         */
        public String getExtra() {
            return this.extra;
        }

        /**
         * @return refundRule
         */
        public FlightRuleListRefundRule getRefundRule() {
            return this.refundRule;
        }

        /**
         * @return refundRuleItem
         */
        public FlightRuleListRefundRuleItem getRefundRuleItem() {
            return this.refundRuleItem;
        }

        /**
         * @return signRule
         */
        public FlightRuleListSignRule getSignRule() {
            return this.signRule;
        }

        /**
         * @return tuigaiqianInfo
         */
        public String getTuigaiqianInfo() {
            return this.tuigaiqianInfo;
        }

        /**
         * @return upgradeRule
         */
        public FlightRuleListUpgradeRule getUpgradeRule() {
            return this.upgradeRule;
        }

        public static final class Builder {
            private String baggageInfo; 
            private FlightRuleListBaggageItem baggageItem; 
            private FlightRuleListChangeRule changeRule; 
            private FlightRuleListChangeRuleItem changeRuleItem; 
            private String extra; 
            private FlightRuleListRefundRule refundRule; 
            private FlightRuleListRefundRuleItem refundRuleItem; 
            private FlightRuleListSignRule signRule; 
            private String tuigaiqianInfo; 
            private FlightRuleListUpgradeRule upgradeRule; 

            /**
             * 行李额描述
             */
            public Builder baggageInfo(String baggageInfo) {
                this.baggageInfo = baggageInfo;
                return this;
            }

            /**
             * baggage_item.
             */
            public Builder baggageItem(FlightRuleListBaggageItem baggageItem) {
                this.baggageItem = baggageItem;
                return this;
            }

            /**
             * 改签规则
             */
            public Builder changeRule(FlightRuleListChangeRule changeRule) {
                this.changeRule = changeRule;
                return this;
            }

            /**
             * change_rule_item.
             */
            public Builder changeRuleItem(FlightRuleListChangeRuleItem changeRuleItem) {
                this.changeRuleItem = changeRuleItem;
                return this;
            }

            /**
             * 额外信息
             */
            public Builder extra(String extra) {
                this.extra = extra;
                return this;
            }

            /**
             * 退票规则
             */
            public Builder refundRule(FlightRuleListRefundRule refundRule) {
                this.refundRule = refundRule;
                return this;
            }

            /**
             * refund_rule_item.
             */
            public Builder refundRuleItem(FlightRuleListRefundRuleItem refundRuleItem) {
                this.refundRuleItem = refundRuleItem;
                return this;
            }

            /**
             * 签转规则
             */
            public Builder signRule(FlightRuleListSignRule signRule) {
                this.signRule = signRule;
                return this;
            }

            /**
             * 退改签描述
             */
            public Builder tuigaiqianInfo(String tuigaiqianInfo) {
                this.tuigaiqianInfo = tuigaiqianInfo;
                return this;
            }

            /**
             * 升舱规则
             */
            public Builder upgradeRule(FlightRuleListUpgradeRule upgradeRule) {
                this.upgradeRule = upgradeRule;
                return this;
            }

            public FlightListFlightRuleList build() {
                return new FlightListFlightRuleList(this);
            } 

        } 

    }
    public static class TransferAirlineInfo extends TeaModel {
        @NameInMap("airline_code")
        private String airlineCode;

        @NameInMap("airline_name")
        private String airlineName;

        @NameInMap("airline_simple_name")
        private String airlineSimpleName;

        private TransferAirlineInfo(Builder builder) {
            this.airlineCode = builder.airlineCode;
            this.airlineName = builder.airlineName;
            this.airlineSimpleName = builder.airlineSimpleName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TransferAirlineInfo create() {
            return builder().build();
        }

        /**
         * @return airlineCode
         */
        public String getAirlineCode() {
            return this.airlineCode;
        }

        /**
         * @return airlineName
         */
        public String getAirlineName() {
            return this.airlineName;
        }

        /**
         * @return airlineSimpleName
         */
        public String getAirlineSimpleName() {
            return this.airlineSimpleName;
        }

        public static final class Builder {
            private String airlineCode; 
            private String airlineName; 
            private String airlineSimpleName; 

            /**
             * 必填项,航司编码
             */
            public Builder airlineCode(String airlineCode) {
                this.airlineCode = airlineCode;
                return this;
            }

            /**
             * 必填项,航司名称
             */
            public Builder airlineName(String airlineName) {
                this.airlineName = airlineName;
                return this;
            }

            /**
             * 必填项,航司简称
             */
            public Builder airlineSimpleName(String airlineSimpleName) {
                this.airlineSimpleName = airlineSimpleName;
                return this;
            }

            public TransferAirlineInfo build() {
                return new TransferAirlineInfo(this);
            } 

        } 

    }
    public static class TransferArrAirportInfo extends TeaModel {
        @NameInMap("airport_code")
        private String airportCode;

        @NameInMap("airport_name")
        private String airportName;

        @NameInMap("city_code")
        private String cityCode;

        @NameInMap("city_name")
        private String cityName;

        @NameInMap("terminal")
        private String terminal;

        private TransferArrAirportInfo(Builder builder) {
            this.airportCode = builder.airportCode;
            this.airportName = builder.airportName;
            this.cityCode = builder.cityCode;
            this.cityName = builder.cityName;
            this.terminal = builder.terminal;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TransferArrAirportInfo create() {
            return builder().build();
        }

        /**
         * @return airportCode
         */
        public String getAirportCode() {
            return this.airportCode;
        }

        /**
         * @return airportName
         */
        public String getAirportName() {
            return this.airportName;
        }

        /**
         * @return cityCode
         */
        public String getCityCode() {
            return this.cityCode;
        }

        /**
         * @return cityName
         */
        public String getCityName() {
            return this.cityName;
        }

        /**
         * @return terminal
         */
        public String getTerminal() {
            return this.terminal;
        }

        public static final class Builder {
            private String airportCode; 
            private String airportName; 
            private String cityCode; 
            private String cityName; 
            private String terminal; 

            /**
             * 必填项,机场编码
             */
            public Builder airportCode(String airportCode) {
                this.airportCode = airportCode;
                return this;
            }

            /**
             * 必填项,机场编码
             */
            public Builder airportName(String airportName) {
                this.airportName = airportName;
                return this;
            }

            /**
             * 必填项,城市编码
             */
            public Builder cityCode(String cityCode) {
                this.cityCode = cityCode;
                return this;
            }

            /**
             * 必填项,城市名称
             */
            public Builder cityName(String cityName) {
                this.cityName = cityName;
                return this;
            }

            /**
             * 必填项,航站楼
             */
            public Builder terminal(String terminal) {
                this.terminal = terminal;
                return this;
            }

            public TransferArrAirportInfo build() {
                return new TransferArrAirportInfo(this);
            } 

        } 

    }
    public static class TransferDepAirportInfo extends TeaModel {
        @NameInMap("airport_code")
        private String airportCode;

        @NameInMap("airport_name")
        private String airportName;

        @NameInMap("city_code")
        private String cityCode;

        @NameInMap("city_name")
        private String cityName;

        @NameInMap("terminal")
        private String terminal;

        private TransferDepAirportInfo(Builder builder) {
            this.airportCode = builder.airportCode;
            this.airportName = builder.airportName;
            this.cityCode = builder.cityCode;
            this.cityName = builder.cityName;
            this.terminal = builder.terminal;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TransferDepAirportInfo create() {
            return builder().build();
        }

        /**
         * @return airportCode
         */
        public String getAirportCode() {
            return this.airportCode;
        }

        /**
         * @return airportName
         */
        public String getAirportName() {
            return this.airportName;
        }

        /**
         * @return cityCode
         */
        public String getCityCode() {
            return this.cityCode;
        }

        /**
         * @return cityName
         */
        public String getCityName() {
            return this.cityName;
        }

        /**
         * @return terminal
         */
        public String getTerminal() {
            return this.terminal;
        }

        public static final class Builder {
            private String airportCode; 
            private String airportName; 
            private String cityCode; 
            private String cityName; 
            private String terminal; 

            /**
             * 必填项,机场编码
             */
            public Builder airportCode(String airportCode) {
                this.airportCode = airportCode;
                return this;
            }

            /**
             * 必填项,机场编码
             */
            public Builder airportName(String airportName) {
                this.airportName = airportName;
                return this;
            }

            /**
             * 必填项,城市编码
             */
            public Builder cityCode(String cityCode) {
                this.cityCode = cityCode;
                return this;
            }

            /**
             * 必填项,城市名称
             */
            public Builder cityName(String cityName) {
                this.cityName = cityName;
                return this;
            }

            /**
             * 必填项,航站楼
             */
            public Builder terminal(String terminal) {
                this.terminal = terminal;
                return this;
            }

            public TransferDepAirportInfo build() {
                return new TransferDepAirportInfo(this);
            } 

        } 

    }
    public static class BaggageSubItemsBaggageSubContentVisualizesDescription extends TeaModel {
        @NameInMap("desc")
        private String desc;

        @NameInMap("icon")
        private String icon;

        @NameInMap("image")
        private String image;

        @NameInMap("title")
        private String title;

        private BaggageSubItemsBaggageSubContentVisualizesDescription(Builder builder) {
            this.desc = builder.desc;
            this.icon = builder.icon;
            this.image = builder.image;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BaggageSubItemsBaggageSubContentVisualizesDescription create() {
            return builder().build();
        }

        /**
         * @return desc
         */
        public String getDesc() {
            return this.desc;
        }

        /**
         * @return icon
         */
        public String getIcon() {
            return this.icon;
        }

        /**
         * @return image
         */
        public String getImage() {
            return this.image;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String desc; 
            private String icon; 
            private String image; 
            private String title; 

            /**
             * desc.
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * icon.
             */
            public Builder icon(String icon) {
                this.icon = icon;
                return this;
            }

            /**
             * image.
             */
            public Builder image(String image) {
                this.image = image;
                return this;
            }

            /**
             * title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public BaggageSubItemsBaggageSubContentVisualizesDescription build() {
                return new BaggageSubItemsBaggageSubContentVisualizesDescription(this);
            } 

        } 

    }
    public static class BaggageSubItemsBaggageSubContentVisualizesImageDO extends TeaModel {
        @NameInMap("image")
        private String image;

        @NameInMap("largest")
        private String largest;

        @NameInMap("middle")
        private String middle;

        @NameInMap("smallest")
        private String smallest;

        private BaggageSubItemsBaggageSubContentVisualizesImageDO(Builder builder) {
            this.image = builder.image;
            this.largest = builder.largest;
            this.middle = builder.middle;
            this.smallest = builder.smallest;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BaggageSubItemsBaggageSubContentVisualizesImageDO create() {
            return builder().build();
        }

        /**
         * @return image
         */
        public String getImage() {
            return this.image;
        }

        /**
         * @return largest
         */
        public String getLargest() {
            return this.largest;
        }

        /**
         * @return middle
         */
        public String getMiddle() {
            return this.middle;
        }

        /**
         * @return smallest
         */
        public String getSmallest() {
            return this.smallest;
        }

        public static final class Builder {
            private String image; 
            private String largest; 
            private String middle; 
            private String smallest; 

            /**
             * image.
             */
            public Builder image(String image) {
                this.image = image;
                return this;
            }

            /**
             * largest.
             */
            public Builder largest(String largest) {
                this.largest = largest;
                return this;
            }

            /**
             * middle.
             */
            public Builder middle(String middle) {
                this.middle = middle;
                return this;
            }

            /**
             * smallest.
             */
            public Builder smallest(String smallest) {
                this.smallest = smallest;
                return this;
            }

            public BaggageSubItemsBaggageSubContentVisualizesImageDO build() {
                return new BaggageSubItemsBaggageSubContentVisualizesImageDO(this);
            } 

        } 

    }
    public static class BaggageItemBaggageSubItemsBaggageSubContentVisualizes extends TeaModel {
        @NameInMap("baggage_desc")
        private java.util.List < String > baggageDesc;

        @NameInMap("baggage_sub_content_type")
        private Integer baggageSubContentType;

        @NameInMap("description")
        private BaggageSubItemsBaggageSubContentVisualizesDescription description;

        @NameInMap("image_d_o")
        private BaggageSubItemsBaggageSubContentVisualizesImageDO imageDO;

        @NameInMap("is_highlight")
        private Boolean isHighlight;

        @NameInMap("sub_title")
        private String subTitle;

        private BaggageItemBaggageSubItemsBaggageSubContentVisualizes(Builder builder) {
            this.baggageDesc = builder.baggageDesc;
            this.baggageSubContentType = builder.baggageSubContentType;
            this.description = builder.description;
            this.imageDO = builder.imageDO;
            this.isHighlight = builder.isHighlight;
            this.subTitle = builder.subTitle;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BaggageItemBaggageSubItemsBaggageSubContentVisualizes create() {
            return builder().build();
        }

        /**
         * @return baggageDesc
         */
        public java.util.List < String > getBaggageDesc() {
            return this.baggageDesc;
        }

        /**
         * @return baggageSubContentType
         */
        public Integer getBaggageSubContentType() {
            return this.baggageSubContentType;
        }

        /**
         * @return description
         */
        public BaggageSubItemsBaggageSubContentVisualizesDescription getDescription() {
            return this.description;
        }

        /**
         * @return imageDO
         */
        public BaggageSubItemsBaggageSubContentVisualizesImageDO getImageDO() {
            return this.imageDO;
        }

        /**
         * @return isHighlight
         */
        public Boolean getIsHighlight() {
            return this.isHighlight;
        }

        /**
         * @return subTitle
         */
        public String getSubTitle() {
            return this.subTitle;
        }

        public static final class Builder {
            private java.util.List < String > baggageDesc; 
            private Integer baggageSubContentType; 
            private BaggageSubItemsBaggageSubContentVisualizesDescription description; 
            private BaggageSubItemsBaggageSubContentVisualizesImageDO imageDO; 
            private Boolean isHighlight; 
            private String subTitle; 

            /**
             * baggage_desc.
             */
            public Builder baggageDesc(java.util.List < String > baggageDesc) {
                this.baggageDesc = baggageDesc;
                return this;
            }

            /**
             * baggage_sub_content_type.
             */
            public Builder baggageSubContentType(Integer baggageSubContentType) {
                this.baggageSubContentType = baggageSubContentType;
                return this;
            }

            /**
             * desc : 您可以随身携带上飞机客舱内的行李物品，由旅客自行负责保管。具体尺寸、重量、类型等以各航空公司规定为准。
             */
            public Builder description(BaggageSubItemsBaggageSubContentVisualizesDescription description) {
                this.description = description;
                return this;
            }

            /**
             * image : https://gw.alicdn.com/imgextra/i3/O1CN01kLt3m923XsUs6WVif_!!6000000007266-2-tps-280-300.png
             */
            public Builder imageDO(BaggageSubItemsBaggageSubContentVisualizesImageDO imageDO) {
                this.imageDO = imageDO;
                return this;
            }

            /**
             * is_highlight.
             */
            public Builder isHighlight(Boolean isHighlight) {
                this.isHighlight = isHighlight;
                return this;
            }

            /**
             * sub_title.
             */
            public Builder subTitle(String subTitle) {
                this.subTitle = subTitle;
                return this;
            }

            public BaggageItemBaggageSubItemsBaggageSubContentVisualizes build() {
                return new BaggageItemBaggageSubItemsBaggageSubContentVisualizes(this);
            } 

        } 

    }
    public static class TransferFlightRuleListBaggageItemBaggageSubItems extends TeaModel {
        @NameInMap("baggage_sub_content_visualizes")
        private java.util.List < BaggageItemBaggageSubItemsBaggageSubContentVisualizes> baggageSubContentVisualizes;

        @NameInMap("extra_content_visualizes")
        private java.util.List < ? > extraContentVisualizes;

        @NameInMap("is_struct")
        private Boolean isStruct;

        @NameInMap("ptc")
        private String ptc;

        @NameInMap("title")
        private String title;

        private TransferFlightRuleListBaggageItemBaggageSubItems(Builder builder) {
            this.baggageSubContentVisualizes = builder.baggageSubContentVisualizes;
            this.extraContentVisualizes = builder.extraContentVisualizes;
            this.isStruct = builder.isStruct;
            this.ptc = builder.ptc;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TransferFlightRuleListBaggageItemBaggageSubItems create() {
            return builder().build();
        }

        /**
         * @return baggageSubContentVisualizes
         */
        public java.util.List < BaggageItemBaggageSubItemsBaggageSubContentVisualizes> getBaggageSubContentVisualizes() {
            return this.baggageSubContentVisualizes;
        }

        /**
         * @return extraContentVisualizes
         */
        public java.util.List < ? > getExtraContentVisualizes() {
            return this.extraContentVisualizes;
        }

        /**
         * @return isStruct
         */
        public Boolean getIsStruct() {
            return this.isStruct;
        }

        /**
         * @return ptc
         */
        public String getPtc() {
            return this.ptc;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private java.util.List < BaggageItemBaggageSubItemsBaggageSubContentVisualizes> baggageSubContentVisualizes; 
            private java.util.List < ? > extraContentVisualizes; 
            private Boolean isStruct; 
            private String ptc; 
            private String title; 

            /**
             * baggageDesc : ["每人可携带 1件 登机","至多 5公斤/件","尺寸不超过 20*40*55cm"]
             */
            public Builder baggageSubContentVisualizes(java.util.List < BaggageItemBaggageSubItemsBaggageSubContentVisualizes> baggageSubContentVisualizes) {
                this.baggageSubContentVisualizes = baggageSubContentVisualizes;
                return this;
            }

            /**
             * extra_content_visualizes.
             */
            public Builder extraContentVisualizes(java.util.List < ? > extraContentVisualizes) {
                this.extraContentVisualizes = extraContentVisualizes;
                return this;
            }

            /**
             * baggageSubContentVisualizes : [
             */
            public Builder isStruct(Boolean isStruct) {
                this.isStruct = isStruct;
                return this;
            }

            /**
             * PTC
             */
            public Builder ptc(String ptc) {
                this.ptc = ptc;
                return this;
            }

            /**
             * title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public TransferFlightRuleListBaggageItemBaggageSubItems build() {
                return new TransferFlightRuleListBaggageItemBaggageSubItems(this);
            } 

        } 

    }
    public static class TransferFlightRuleListBaggageItemTips extends TeaModel {
        @NameInMap("logo")
        private String logo;

        @NameInMap("tips_desc")
        private String tipsDesc;

        @NameInMap("tips_image")
        private String tipsImage;

        private TransferFlightRuleListBaggageItemTips(Builder builder) {
            this.logo = builder.logo;
            this.tipsDesc = builder.tipsDesc;
            this.tipsImage = builder.tipsImage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TransferFlightRuleListBaggageItemTips create() {
            return builder().build();
        }

        /**
         * @return logo
         */
        public String getLogo() {
            return this.logo;
        }

        /**
         * @return tipsDesc
         */
        public String getTipsDesc() {
            return this.tipsDesc;
        }

        /**
         * @return tipsImage
         */
        public String getTipsImage() {
            return this.tipsImage;
        }

        public static final class Builder {
            private String logo; 
            private String tipsDesc; 
            private String tipsImage; 

            /**
             * logo.
             */
            public Builder logo(String logo) {
                this.logo = logo;
                return this;
            }

            /**
             * tips_desc.
             */
            public Builder tipsDesc(String tipsDesc) {
                this.tipsDesc = tipsDesc;
                return this;
            }

            /**
             * tips_image.
             */
            public Builder tipsImage(String tipsImage) {
                this.tipsImage = tipsImage;
                return this;
            }

            public TransferFlightRuleListBaggageItemTips build() {
                return new TransferFlightRuleListBaggageItemTips(this);
            } 

        } 

    }
    public static class TransferFlightRuleListBaggageItem extends TeaModel {
        @NameInMap("baggage_sub_items")
        private java.util.List < TransferFlightRuleListBaggageItemBaggageSubItems> baggageSubItems;

        @NameInMap("index")
        private Integer index;

        @NameInMap("table_head")
        private String tableHead;

        @NameInMap("tips")
        private TransferFlightRuleListBaggageItemTips tips;

        @NameInMap("title")
        private String title;

        @NameInMap("type")
        private Integer type;

        private TransferFlightRuleListBaggageItem(Builder builder) {
            this.baggageSubItems = builder.baggageSubItems;
            this.index = builder.index;
            this.tableHead = builder.tableHead;
            this.tips = builder.tips;
            this.title = builder.title;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TransferFlightRuleListBaggageItem create() {
            return builder().build();
        }

        /**
         * @return baggageSubItems
         */
        public java.util.List < TransferFlightRuleListBaggageItemBaggageSubItems> getBaggageSubItems() {
            return this.baggageSubItems;
        }

        /**
         * @return index
         */
        public Integer getIndex() {
            return this.index;
        }

        /**
         * @return tableHead
         */
        public String getTableHead() {
            return this.tableHead;
        }

        /**
         * @return tips
         */
        public TransferFlightRuleListBaggageItemTips getTips() {
            return this.tips;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        public static final class Builder {
            private java.util.List < TransferFlightRuleListBaggageItemBaggageSubItems> baggageSubItems; 
            private Integer index; 
            private String tableHead; 
            private TransferFlightRuleListBaggageItemTips tips; 
            private String title; 
            private Integer type; 

            /**
             * baggage_sub_items.
             */
            public Builder baggageSubItems(java.util.List < TransferFlightRuleListBaggageItemBaggageSubItems> baggageSubItems) {
                this.baggageSubItems = baggageSubItems;
                return this;
            }

            /**
             * baggageSubItems : [
             */
            public Builder index(Integer index) {
                this.index = index;
                return this;
            }

            /**
             * table_head.
             */
            public Builder tableHead(String tableHead) {
                this.tableHead = tableHead;
                return this;
            }

            /**
             * logo : https://gw.alicdn.com/imgextra/i1/O1CN019zl3WZ22fNLxzx2cR_!!6000000007147-2-tps-125-45.png
             */
            public Builder tips(TransferFlightRuleListBaggageItemTips tips) {
                this.tips = tips;
                return this;
            }

            /**
             * title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * type.
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            public TransferFlightRuleListBaggageItem build() {
                return new TransferFlightRuleListBaggageItem(this);
            } 

        } 

    }
    public static class TransferFlightRuleListChangeRuleInfo extends TeaModel {
        @NameInMap("content")
        private String content;

        @NameInMap("cost")
        private Integer cost;

        @NameInMap("cost_percent")
        private Integer costPercent;

        @NameInMap("time_stamp")
        private Integer timeStamp;

        @NameInMap("time_type")
        private String timeType;

        @NameInMap("title")
        private String title;

        private TransferFlightRuleListChangeRuleInfo(Builder builder) {
            this.content = builder.content;
            this.cost = builder.cost;
            this.costPercent = builder.costPercent;
            this.timeStamp = builder.timeStamp;
            this.timeType = builder.timeType;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TransferFlightRuleListChangeRuleInfo create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return cost
         */
        public Integer getCost() {
            return this.cost;
        }

        /**
         * @return costPercent
         */
        public Integer getCostPercent() {
            return this.costPercent;
        }

        /**
         * @return timeStamp
         */
        public Integer getTimeStamp() {
            return this.timeStamp;
        }

        /**
         * @return timeType
         */
        public String getTimeType() {
            return this.timeType;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String content; 
            private Integer cost; 
            private Integer costPercent; 
            private Integer timeStamp; 
            private String timeType; 
            private String title; 

            /**
             * content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * cost.
             */
            public Builder cost(Integer cost) {
                this.cost = cost;
                return this;
            }

            /**
             * cost_percent.
             */
            public Builder costPercent(Integer costPercent) {
                this.costPercent = costPercent;
                return this;
            }

            /**
             * time_stamp.
             */
            public Builder timeStamp(Integer timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            /**
             * time_type.
             */
            public Builder timeType(String timeType) {
                this.timeType = timeType;
                return this;
            }

            /**
             * title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public TransferFlightRuleListChangeRuleInfo build() {
                return new TransferFlightRuleListChangeRuleInfo(this);
            } 

        } 

    }
    public static class TransferFlightRuleListChangeRule extends TeaModel {
        @NameInMap("able")
        private Boolean able;

        @NameInMap("info")
        private java.util.List < TransferFlightRuleListChangeRuleInfo> info;

        private TransferFlightRuleListChangeRule(Builder builder) {
            this.able = builder.able;
            this.info = builder.info;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TransferFlightRuleListChangeRule create() {
            return builder().build();
        }

        /**
         * @return able
         */
        public Boolean getAble() {
            return this.able;
        }

        /**
         * @return info
         */
        public java.util.List < TransferFlightRuleListChangeRuleInfo> getInfo() {
            return this.info;
        }

        public static final class Builder {
            private Boolean able; 
            private java.util.List < TransferFlightRuleListChangeRuleInfo> info; 

            /**
             * able.
             */
            public Builder able(Boolean able) {
                this.able = able;
                return this;
            }

            /**
             * info.
             */
            public Builder info(java.util.List < TransferFlightRuleListChangeRuleInfo> info) {
                this.info = info;
                return this;
            }

            public TransferFlightRuleListChangeRule build() {
                return new TransferFlightRuleListChangeRule(this);
            } 

        } 

    }
    public static class TransferFlightRuleListChangeRuleItemExtraContents extends TeaModel {
        @NameInMap("content")
        private String content;

        @NameInMap("title")
        private String title;

        private TransferFlightRuleListChangeRuleItemExtraContents(Builder builder) {
            this.content = builder.content;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TransferFlightRuleListChangeRuleItemExtraContents create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String content; 
            private String title; 

            /**
             * content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public TransferFlightRuleListChangeRuleItemExtraContents build() {
                return new TransferFlightRuleListChangeRuleItemExtraContents(this);
            } 

        } 

    }
    public static class TransferFlightRuleListChangeRuleItemRefundSubItemsRefundSubContents extends TeaModel {
        @NameInMap("fee_desc")
        private String feeDesc;

        @NameInMap("fee_range")
        private String feeRange;

        @NameInMap("style")
        private Integer style;

        private TransferFlightRuleListChangeRuleItemRefundSubItemsRefundSubContents(Builder builder) {
            this.feeDesc = builder.feeDesc;
            this.feeRange = builder.feeRange;
            this.style = builder.style;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TransferFlightRuleListChangeRuleItemRefundSubItemsRefundSubContents create() {
            return builder().build();
        }

        /**
         * @return feeDesc
         */
        public String getFeeDesc() {
            return this.feeDesc;
        }

        /**
         * @return feeRange
         */
        public String getFeeRange() {
            return this.feeRange;
        }

        /**
         * @return style
         */
        public Integer getStyle() {
            return this.style;
        }

        public static final class Builder {
            private String feeDesc; 
            private String feeRange; 
            private Integer style; 

            /**
             * fee_desc.
             */
            public Builder feeDesc(String feeDesc) {
                this.feeDesc = feeDesc;
                return this;
            }

            /**
             * fee_range.
             */
            public Builder feeRange(String feeRange) {
                this.feeRange = feeRange;
                return this;
            }

            /**
             * style.
             */
            public Builder style(Integer style) {
                this.style = style;
                return this;
            }

            public TransferFlightRuleListChangeRuleItemRefundSubItemsRefundSubContents build() {
                return new TransferFlightRuleListChangeRuleItemRefundSubItemsRefundSubContents(this);
            } 

        } 

    }
    public static class TransferFlightRuleListChangeRuleItemRefundSubItems extends TeaModel {
        @NameInMap("is_struct")
        private Boolean isStruct;

        @NameInMap("ptc")
        private String ptc;

        @NameInMap("refund_sub_contents")
        private java.util.List < TransferFlightRuleListChangeRuleItemRefundSubItemsRefundSubContents> refundSubContents;

        @NameInMap("title")
        private String title;

        private TransferFlightRuleListChangeRuleItemRefundSubItems(Builder builder) {
            this.isStruct = builder.isStruct;
            this.ptc = builder.ptc;
            this.refundSubContents = builder.refundSubContents;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TransferFlightRuleListChangeRuleItemRefundSubItems create() {
            return builder().build();
        }

        /**
         * @return isStruct
         */
        public Boolean getIsStruct() {
            return this.isStruct;
        }

        /**
         * @return ptc
         */
        public String getPtc() {
            return this.ptc;
        }

        /**
         * @return refundSubContents
         */
        public java.util.List < TransferFlightRuleListChangeRuleItemRefundSubItemsRefundSubContents> getRefundSubContents() {
            return this.refundSubContents;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private Boolean isStruct; 
            private String ptc; 
            private java.util.List < TransferFlightRuleListChangeRuleItemRefundSubItemsRefundSubContents> refundSubContents; 
            private String title; 

            /**
             * isStruct : true
             */
            public Builder isStruct(Boolean isStruct) {
                this.isStruct = isStruct;
                return this;
            }

            /**
             * PTC
             */
            public Builder ptc(String ptc) {
                this.ptc = ptc;
                return this;
            }

            /**
             * feeDesc : ￥156/人
             */
            public Builder refundSubContents(java.util.List < TransferFlightRuleListChangeRuleItemRefundSubItemsRefundSubContents> refundSubContents) {
                this.refundSubContents = refundSubContents;
                return this;
            }

            /**
             * title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public TransferFlightRuleListChangeRuleItemRefundSubItems build() {
                return new TransferFlightRuleListChangeRuleItemRefundSubItems(this);
            } 

        } 

    }
    public static class TransferFlightRuleListChangeRuleItem extends TeaModel {
        @NameInMap("extra_contents")
        private java.util.List < TransferFlightRuleListChangeRuleItemExtraContents> extraContents;

        @NameInMap("index")
        private Integer index;

        @NameInMap("refund_sub_items")
        private java.util.List < TransferFlightRuleListChangeRuleItemRefundSubItems> refundSubItems;

        @NameInMap("sub_table_head")
        private java.util.List < String > subTableHead;

        @NameInMap("table_head")
        private String tableHead;

        @NameInMap("title")
        private String title;

        @NameInMap("type")
        private Integer type;

        private TransferFlightRuleListChangeRuleItem(Builder builder) {
            this.extraContents = builder.extraContents;
            this.index = builder.index;
            this.refundSubItems = builder.refundSubItems;
            this.subTableHead = builder.subTableHead;
            this.tableHead = builder.tableHead;
            this.title = builder.title;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TransferFlightRuleListChangeRuleItem create() {
            return builder().build();
        }

        /**
         * @return extraContents
         */
        public java.util.List < TransferFlightRuleListChangeRuleItemExtraContents> getExtraContents() {
            return this.extraContents;
        }

        /**
         * @return index
         */
        public Integer getIndex() {
            return this.index;
        }

        /**
         * @return refundSubItems
         */
        public java.util.List < TransferFlightRuleListChangeRuleItemRefundSubItems> getRefundSubItems() {
            return this.refundSubItems;
        }

        /**
         * @return subTableHead
         */
        public java.util.List < String > getSubTableHead() {
            return this.subTableHead;
        }

        /**
         * @return tableHead
         */
        public String getTableHead() {
            return this.tableHead;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        public static final class Builder {
            private java.util.List < TransferFlightRuleListChangeRuleItemExtraContents> extraContents; 
            private Integer index; 
            private java.util.List < TransferFlightRuleListChangeRuleItemRefundSubItems> refundSubItems; 
            private java.util.List < String > subTableHead; 
            private String tableHead; 
            private String title; 
            private Integer type; 

            /**
             * content : 不可签转
             */
            public Builder extraContents(java.util.List < TransferFlightRuleListChangeRuleItemExtraContents> extraContents) {
                this.extraContents = extraContents;
                return this;
            }

            /**
             * extraContents : [
             */
            public Builder index(Integer index) {
                this.index = index;
                return this;
            }

            /**
             * refund_sub_items.
             */
            public Builder refundSubItems(java.util.List < TransferFlightRuleListChangeRuleItemRefundSubItems> refundSubItems) {
                this.refundSubItems = refundSubItems;
                return this;
            }

            /**
             * sub_table_head.
             */
            public Builder subTableHead(java.util.List < String > subTableHead) {
                this.subTableHead = subTableHead;
                return this;
            }

            /**
             * table_head.
             */
            public Builder tableHead(String tableHead) {
                this.tableHead = tableHead;
                return this;
            }

            /**
             * title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * type.
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            public TransferFlightRuleListChangeRuleItem build() {
                return new TransferFlightRuleListChangeRuleItem(this);
            } 

        } 

    }
    public static class TransferFlightRuleListRefundRuleInfo extends TeaModel {
        @NameInMap("content")
        private String content;

        @NameInMap("cost")
        private Integer cost;

        @NameInMap("cost_percent")
        private Integer costPercent;

        @NameInMap("time_stamp")
        private Integer timeStamp;

        @NameInMap("time_type")
        private String timeType;

        @NameInMap("title")
        private String title;

        private TransferFlightRuleListRefundRuleInfo(Builder builder) {
            this.content = builder.content;
            this.cost = builder.cost;
            this.costPercent = builder.costPercent;
            this.timeStamp = builder.timeStamp;
            this.timeType = builder.timeType;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TransferFlightRuleListRefundRuleInfo create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return cost
         */
        public Integer getCost() {
            return this.cost;
        }

        /**
         * @return costPercent
         */
        public Integer getCostPercent() {
            return this.costPercent;
        }

        /**
         * @return timeStamp
         */
        public Integer getTimeStamp() {
            return this.timeStamp;
        }

        /**
         * @return timeType
         */
        public String getTimeType() {
            return this.timeType;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String content; 
            private Integer cost; 
            private Integer costPercent; 
            private Integer timeStamp; 
            private String timeType; 
            private String title; 

            /**
             * content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * cost.
             */
            public Builder cost(Integer cost) {
                this.cost = cost;
                return this;
            }

            /**
             * cost_percent.
             */
            public Builder costPercent(Integer costPercent) {
                this.costPercent = costPercent;
                return this;
            }

            /**
             * time_stamp.
             */
            public Builder timeStamp(Integer timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            /**
             * time_type.
             */
            public Builder timeType(String timeType) {
                this.timeType = timeType;
                return this;
            }

            /**
             * title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public TransferFlightRuleListRefundRuleInfo build() {
                return new TransferFlightRuleListRefundRuleInfo(this);
            } 

        } 

    }
    public static class TransferFlightRuleListRefundRule extends TeaModel {
        @NameInMap("able")
        private Boolean able;

        @NameInMap("info")
        private java.util.List < TransferFlightRuleListRefundRuleInfo> info;

        private TransferFlightRuleListRefundRule(Builder builder) {
            this.able = builder.able;
            this.info = builder.info;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TransferFlightRuleListRefundRule create() {
            return builder().build();
        }

        /**
         * @return able
         */
        public Boolean getAble() {
            return this.able;
        }

        /**
         * @return info
         */
        public java.util.List < TransferFlightRuleListRefundRuleInfo> getInfo() {
            return this.info;
        }

        public static final class Builder {
            private Boolean able; 
            private java.util.List < TransferFlightRuleListRefundRuleInfo> info; 

            /**
             * able.
             */
            public Builder able(Boolean able) {
                this.able = able;
                return this;
            }

            /**
             * info.
             */
            public Builder info(java.util.List < TransferFlightRuleListRefundRuleInfo> info) {
                this.info = info;
                return this;
            }

            public TransferFlightRuleListRefundRule build() {
                return new TransferFlightRuleListRefundRule(this);
            } 

        } 

    }
    public static class TransferFlightRuleListRefundRuleItemExtraContents extends TeaModel {
        @NameInMap("content")
        private String content;

        @NameInMap("title")
        private String title;

        private TransferFlightRuleListRefundRuleItemExtraContents(Builder builder) {
            this.content = builder.content;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TransferFlightRuleListRefundRuleItemExtraContents create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String content; 
            private String title; 

            /**
             * content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public TransferFlightRuleListRefundRuleItemExtraContents build() {
                return new TransferFlightRuleListRefundRuleItemExtraContents(this);
            } 

        } 

    }
    public static class TransferFlightRuleListRefundRuleItemRefundSubItemsRefundSubContents extends TeaModel {
        @NameInMap("fee_desc")
        private String feeDesc;

        @NameInMap("fee_range")
        private String feeRange;

        @NameInMap("style")
        private Integer style;

        private TransferFlightRuleListRefundRuleItemRefundSubItemsRefundSubContents(Builder builder) {
            this.feeDesc = builder.feeDesc;
            this.feeRange = builder.feeRange;
            this.style = builder.style;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TransferFlightRuleListRefundRuleItemRefundSubItemsRefundSubContents create() {
            return builder().build();
        }

        /**
         * @return feeDesc
         */
        public String getFeeDesc() {
            return this.feeDesc;
        }

        /**
         * @return feeRange
         */
        public String getFeeRange() {
            return this.feeRange;
        }

        /**
         * @return style
         */
        public Integer getStyle() {
            return this.style;
        }

        public static final class Builder {
            private String feeDesc; 
            private String feeRange; 
            private Integer style; 

            /**
             * fee_desc.
             */
            public Builder feeDesc(String feeDesc) {
                this.feeDesc = feeDesc;
                return this;
            }

            /**
             * fee_range.
             */
            public Builder feeRange(String feeRange) {
                this.feeRange = feeRange;
                return this;
            }

            /**
             * style.
             */
            public Builder style(Integer style) {
                this.style = style;
                return this;
            }

            public TransferFlightRuleListRefundRuleItemRefundSubItemsRefundSubContents build() {
                return new TransferFlightRuleListRefundRuleItemRefundSubItemsRefundSubContents(this);
            } 

        } 

    }
    public static class TransferFlightRuleListRefundRuleItemRefundSubItems extends TeaModel {
        @NameInMap("is_struct")
        private Boolean isStruct;

        @NameInMap("ptc")
        private String ptc;

        @NameInMap("refund_sub_contents")
        private java.util.List < TransferFlightRuleListRefundRuleItemRefundSubItemsRefundSubContents> refundSubContents;

        @NameInMap("title")
        private String title;

        private TransferFlightRuleListRefundRuleItemRefundSubItems(Builder builder) {
            this.isStruct = builder.isStruct;
            this.ptc = builder.ptc;
            this.refundSubContents = builder.refundSubContents;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TransferFlightRuleListRefundRuleItemRefundSubItems create() {
            return builder().build();
        }

        /**
         * @return isStruct
         */
        public Boolean getIsStruct() {
            return this.isStruct;
        }

        /**
         * @return ptc
         */
        public String getPtc() {
            return this.ptc;
        }

        /**
         * @return refundSubContents
         */
        public java.util.List < TransferFlightRuleListRefundRuleItemRefundSubItemsRefundSubContents> getRefundSubContents() {
            return this.refundSubContents;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private Boolean isStruct; 
            private String ptc; 
            private java.util.List < TransferFlightRuleListRefundRuleItemRefundSubItemsRefundSubContents> refundSubContents; 
            private String title; 

            /**
             * isStruct : true
             */
            public Builder isStruct(Boolean isStruct) {
                this.isStruct = isStruct;
                return this;
            }

            /**
             * PTC
             */
            public Builder ptc(String ptc) {
                this.ptc = ptc;
                return this;
            }

            /**
             * feeDesc : ￥156/人
             */
            public Builder refundSubContents(java.util.List < TransferFlightRuleListRefundRuleItemRefundSubItemsRefundSubContents> refundSubContents) {
                this.refundSubContents = refundSubContents;
                return this;
            }

            /**
             * title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public TransferFlightRuleListRefundRuleItemRefundSubItems build() {
                return new TransferFlightRuleListRefundRuleItemRefundSubItems(this);
            } 

        } 

    }
    public static class TransferFlightRuleListRefundRuleItem extends TeaModel {
        @NameInMap("extra_contents")
        private java.util.List < TransferFlightRuleListRefundRuleItemExtraContents> extraContents;

        @NameInMap("index")
        private Integer index;

        @NameInMap("refund_sub_items")
        private java.util.List < TransferFlightRuleListRefundRuleItemRefundSubItems> refundSubItems;

        @NameInMap("sub_table_head")
        private java.util.List < String > subTableHead;

        @NameInMap("table_head")
        private String tableHead;

        @NameInMap("title")
        private String title;

        @NameInMap("type")
        private Integer type;

        private TransferFlightRuleListRefundRuleItem(Builder builder) {
            this.extraContents = builder.extraContents;
            this.index = builder.index;
            this.refundSubItems = builder.refundSubItems;
            this.subTableHead = builder.subTableHead;
            this.tableHead = builder.tableHead;
            this.title = builder.title;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TransferFlightRuleListRefundRuleItem create() {
            return builder().build();
        }

        /**
         * @return extraContents
         */
        public java.util.List < TransferFlightRuleListRefundRuleItemExtraContents> getExtraContents() {
            return this.extraContents;
        }

        /**
         * @return index
         */
        public Integer getIndex() {
            return this.index;
        }

        /**
         * @return refundSubItems
         */
        public java.util.List < TransferFlightRuleListRefundRuleItemRefundSubItems> getRefundSubItems() {
            return this.refundSubItems;
        }

        /**
         * @return subTableHead
         */
        public java.util.List < String > getSubTableHead() {
            return this.subTableHead;
        }

        /**
         * @return tableHead
         */
        public String getTableHead() {
            return this.tableHead;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        public static final class Builder {
            private java.util.List < TransferFlightRuleListRefundRuleItemExtraContents> extraContents; 
            private Integer index; 
            private java.util.List < TransferFlightRuleListRefundRuleItemRefundSubItems> refundSubItems; 
            private java.util.List < String > subTableHead; 
            private String tableHead; 
            private String title; 
            private Integer type; 

            /**
             * content : 不可签转
             */
            public Builder extraContents(java.util.List < TransferFlightRuleListRefundRuleItemExtraContents> extraContents) {
                this.extraContents = extraContents;
                return this;
            }

            /**
             * extraContents : [
             */
            public Builder index(Integer index) {
                this.index = index;
                return this;
            }

            /**
             * refund_sub_items.
             */
            public Builder refundSubItems(java.util.List < TransferFlightRuleListRefundRuleItemRefundSubItems> refundSubItems) {
                this.refundSubItems = refundSubItems;
                return this;
            }

            /**
             * sub_table_head.
             */
            public Builder subTableHead(java.util.List < String > subTableHead) {
                this.subTableHead = subTableHead;
                return this;
            }

            /**
             * table_head.
             */
            public Builder tableHead(String tableHead) {
                this.tableHead = tableHead;
                return this;
            }

            /**
             * title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * type.
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            public TransferFlightRuleListRefundRuleItem build() {
                return new TransferFlightRuleListRefundRuleItem(this);
            } 

        } 

    }
    public static class TransferFlightRuleListSignRuleInfo extends TeaModel {
        @NameInMap("content")
        private String content;

        @NameInMap("cost")
        private Integer cost;

        @NameInMap("cost_percent")
        private Integer costPercent;

        @NameInMap("time_stamp")
        private Integer timeStamp;

        @NameInMap("time_type")
        private String timeType;

        @NameInMap("title")
        private String title;

        private TransferFlightRuleListSignRuleInfo(Builder builder) {
            this.content = builder.content;
            this.cost = builder.cost;
            this.costPercent = builder.costPercent;
            this.timeStamp = builder.timeStamp;
            this.timeType = builder.timeType;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TransferFlightRuleListSignRuleInfo create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return cost
         */
        public Integer getCost() {
            return this.cost;
        }

        /**
         * @return costPercent
         */
        public Integer getCostPercent() {
            return this.costPercent;
        }

        /**
         * @return timeStamp
         */
        public Integer getTimeStamp() {
            return this.timeStamp;
        }

        /**
         * @return timeType
         */
        public String getTimeType() {
            return this.timeType;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String content; 
            private Integer cost; 
            private Integer costPercent; 
            private Integer timeStamp; 
            private String timeType; 
            private String title; 

            /**
             * content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * cost.
             */
            public Builder cost(Integer cost) {
                this.cost = cost;
                return this;
            }

            /**
             * cost_percent.
             */
            public Builder costPercent(Integer costPercent) {
                this.costPercent = costPercent;
                return this;
            }

            /**
             * time_stamp.
             */
            public Builder timeStamp(Integer timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            /**
             * time_type.
             */
            public Builder timeType(String timeType) {
                this.timeType = timeType;
                return this;
            }

            /**
             * title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public TransferFlightRuleListSignRuleInfo build() {
                return new TransferFlightRuleListSignRuleInfo(this);
            } 

        } 

    }
    public static class TransferFlightRuleListSignRule extends TeaModel {
        @NameInMap("able")
        private Boolean able;

        @NameInMap("info")
        private java.util.List < TransferFlightRuleListSignRuleInfo> info;

        private TransferFlightRuleListSignRule(Builder builder) {
            this.able = builder.able;
            this.info = builder.info;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TransferFlightRuleListSignRule create() {
            return builder().build();
        }

        /**
         * @return able
         */
        public Boolean getAble() {
            return this.able;
        }

        /**
         * @return info
         */
        public java.util.List < TransferFlightRuleListSignRuleInfo> getInfo() {
            return this.info;
        }

        public static final class Builder {
            private Boolean able; 
            private java.util.List < TransferFlightRuleListSignRuleInfo> info; 

            /**
             * able.
             */
            public Builder able(Boolean able) {
                this.able = able;
                return this;
            }

            /**
             * info.
             */
            public Builder info(java.util.List < TransferFlightRuleListSignRuleInfo> info) {
                this.info = info;
                return this;
            }

            public TransferFlightRuleListSignRule build() {
                return new TransferFlightRuleListSignRule(this);
            } 

        } 

    }
    public static class TransferFlightRuleListUpgradeRuleInfo extends TeaModel {
        @NameInMap("content")
        private String content;

        @NameInMap("cost")
        private Integer cost;

        @NameInMap("cost_percent")
        private Integer costPercent;

        @NameInMap("time_stamp")
        private Integer timeStamp;

        @NameInMap("time_type")
        private String timeType;

        @NameInMap("title")
        private String title;

        private TransferFlightRuleListUpgradeRuleInfo(Builder builder) {
            this.content = builder.content;
            this.cost = builder.cost;
            this.costPercent = builder.costPercent;
            this.timeStamp = builder.timeStamp;
            this.timeType = builder.timeType;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TransferFlightRuleListUpgradeRuleInfo create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return cost
         */
        public Integer getCost() {
            return this.cost;
        }

        /**
         * @return costPercent
         */
        public Integer getCostPercent() {
            return this.costPercent;
        }

        /**
         * @return timeStamp
         */
        public Integer getTimeStamp() {
            return this.timeStamp;
        }

        /**
         * @return timeType
         */
        public String getTimeType() {
            return this.timeType;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String content; 
            private Integer cost; 
            private Integer costPercent; 
            private Integer timeStamp; 
            private String timeType; 
            private String title; 

            /**
             * content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * cost.
             */
            public Builder cost(Integer cost) {
                this.cost = cost;
                return this;
            }

            /**
             * cost_percent.
             */
            public Builder costPercent(Integer costPercent) {
                this.costPercent = costPercent;
                return this;
            }

            /**
             * time_stamp.
             */
            public Builder timeStamp(Integer timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            /**
             * time_type.
             */
            public Builder timeType(String timeType) {
                this.timeType = timeType;
                return this;
            }

            /**
             * title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public TransferFlightRuleListUpgradeRuleInfo build() {
                return new TransferFlightRuleListUpgradeRuleInfo(this);
            } 

        } 

    }
    public static class TransferFlightRuleListUpgradeRule extends TeaModel {
        @NameInMap("able")
        private Boolean able;

        @NameInMap("info")
        private java.util.List < TransferFlightRuleListUpgradeRuleInfo> info;

        private TransferFlightRuleListUpgradeRule(Builder builder) {
            this.able = builder.able;
            this.info = builder.info;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TransferFlightRuleListUpgradeRule create() {
            return builder().build();
        }

        /**
         * @return able
         */
        public Boolean getAble() {
            return this.able;
        }

        /**
         * @return info
         */
        public java.util.List < TransferFlightRuleListUpgradeRuleInfo> getInfo() {
            return this.info;
        }

        public static final class Builder {
            private Boolean able; 
            private java.util.List < TransferFlightRuleListUpgradeRuleInfo> info; 

            /**
             * able.
             */
            public Builder able(Boolean able) {
                this.able = able;
                return this;
            }

            /**
             * info.
             */
            public Builder info(java.util.List < TransferFlightRuleListUpgradeRuleInfo> info) {
                this.info = info;
                return this;
            }

            public TransferFlightRuleListUpgradeRule build() {
                return new TransferFlightRuleListUpgradeRule(this);
            } 

        } 

    }
    public static class TransferFlightRuleList extends TeaModel {
        @NameInMap("baggage_info")
        private String baggageInfo;

        @NameInMap("baggage_item")
        private TransferFlightRuleListBaggageItem baggageItem;

        @NameInMap("change_rule")
        private TransferFlightRuleListChangeRule changeRule;

        @NameInMap("change_rule_item")
        private TransferFlightRuleListChangeRuleItem changeRuleItem;

        @NameInMap("extra")
        private String extra;

        @NameInMap("refund_rule")
        private TransferFlightRuleListRefundRule refundRule;

        @NameInMap("refund_rule_item")
        private TransferFlightRuleListRefundRuleItem refundRuleItem;

        @NameInMap("sign_rule")
        private TransferFlightRuleListSignRule signRule;

        @NameInMap("tuigaiqian_info")
        private String tuigaiqianInfo;

        @NameInMap("upgrade_rule")
        private TransferFlightRuleListUpgradeRule upgradeRule;

        private TransferFlightRuleList(Builder builder) {
            this.baggageInfo = builder.baggageInfo;
            this.baggageItem = builder.baggageItem;
            this.changeRule = builder.changeRule;
            this.changeRuleItem = builder.changeRuleItem;
            this.extra = builder.extra;
            this.refundRule = builder.refundRule;
            this.refundRuleItem = builder.refundRuleItem;
            this.signRule = builder.signRule;
            this.tuigaiqianInfo = builder.tuigaiqianInfo;
            this.upgradeRule = builder.upgradeRule;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TransferFlightRuleList create() {
            return builder().build();
        }

        /**
         * @return baggageInfo
         */
        public String getBaggageInfo() {
            return this.baggageInfo;
        }

        /**
         * @return baggageItem
         */
        public TransferFlightRuleListBaggageItem getBaggageItem() {
            return this.baggageItem;
        }

        /**
         * @return changeRule
         */
        public TransferFlightRuleListChangeRule getChangeRule() {
            return this.changeRule;
        }

        /**
         * @return changeRuleItem
         */
        public TransferFlightRuleListChangeRuleItem getChangeRuleItem() {
            return this.changeRuleItem;
        }

        /**
         * @return extra
         */
        public String getExtra() {
            return this.extra;
        }

        /**
         * @return refundRule
         */
        public TransferFlightRuleListRefundRule getRefundRule() {
            return this.refundRule;
        }

        /**
         * @return refundRuleItem
         */
        public TransferFlightRuleListRefundRuleItem getRefundRuleItem() {
            return this.refundRuleItem;
        }

        /**
         * @return signRule
         */
        public TransferFlightRuleListSignRule getSignRule() {
            return this.signRule;
        }

        /**
         * @return tuigaiqianInfo
         */
        public String getTuigaiqianInfo() {
            return this.tuigaiqianInfo;
        }

        /**
         * @return upgradeRule
         */
        public TransferFlightRuleListUpgradeRule getUpgradeRule() {
            return this.upgradeRule;
        }

        public static final class Builder {
            private String baggageInfo; 
            private TransferFlightRuleListBaggageItem baggageItem; 
            private TransferFlightRuleListChangeRule changeRule; 
            private TransferFlightRuleListChangeRuleItem changeRuleItem; 
            private String extra; 
            private TransferFlightRuleListRefundRule refundRule; 
            private TransferFlightRuleListRefundRuleItem refundRuleItem; 
            private TransferFlightRuleListSignRule signRule; 
            private String tuigaiqianInfo; 
            private TransferFlightRuleListUpgradeRule upgradeRule; 

            /**
             * 行李额描述
             */
            public Builder baggageInfo(String baggageInfo) {
                this.baggageInfo = baggageInfo;
                return this;
            }

            /**
             * baggage_item.
             */
            public Builder baggageItem(TransferFlightRuleListBaggageItem baggageItem) {
                this.baggageItem = baggageItem;
                return this;
            }

            /**
             * 改签规则
             */
            public Builder changeRule(TransferFlightRuleListChangeRule changeRule) {
                this.changeRule = changeRule;
                return this;
            }

            /**
             * change_rule_item.
             */
            public Builder changeRuleItem(TransferFlightRuleListChangeRuleItem changeRuleItem) {
                this.changeRuleItem = changeRuleItem;
                return this;
            }

            /**
             * 额外信息
             */
            public Builder extra(String extra) {
                this.extra = extra;
                return this;
            }

            /**
             * 退票规则
             */
            public Builder refundRule(TransferFlightRuleListRefundRule refundRule) {
                this.refundRule = refundRule;
                return this;
            }

            /**
             * refund_rule_item.
             */
            public Builder refundRuleItem(TransferFlightRuleListRefundRuleItem refundRuleItem) {
                this.refundRuleItem = refundRuleItem;
                return this;
            }

            /**
             * 签转规则
             */
            public Builder signRule(TransferFlightRuleListSignRule signRule) {
                this.signRule = signRule;
                return this;
            }

            /**
             * 退改签描述
             */
            public Builder tuigaiqianInfo(String tuigaiqianInfo) {
                this.tuigaiqianInfo = tuigaiqianInfo;
                return this;
            }

            /**
             * 升舱规则
             */
            public Builder upgradeRule(TransferFlightRuleListUpgradeRule upgradeRule) {
                this.upgradeRule = upgradeRule;
                return this;
            }

            public TransferFlightRuleList build() {
                return new TransferFlightRuleList(this);
            } 

        } 

    }
    public static class TransferInfo extends TeaModel {
        @NameInMap("flight_size")
        private String flightSize;

        @NameInMap("flight_type")
        private String flightType;

        @NameInMap("transfer_airline_info")
        private TransferAirlineInfo transferAirlineInfo;

        @NameInMap("transfer_arr_airport_info")
        private TransferArrAirportInfo transferArrAirportInfo;

        @NameInMap("transfer_arr_date")
        private String transferArrDate;

        @NameInMap("transfer_dep_airport_info")
        private TransferDepAirportInfo transferDepAirportInfo;

        @NameInMap("transfer_dep_date")
        private String transferDepDate;

        @NameInMap("transfer_flight_no")
        private String transferFlightNo;

        @NameInMap("transfer_flight_rule_list")
        private java.util.List < TransferFlightRuleList> transferFlightRuleList;

        private TransferInfo(Builder builder) {
            this.flightSize = builder.flightSize;
            this.flightType = builder.flightType;
            this.transferAirlineInfo = builder.transferAirlineInfo;
            this.transferArrAirportInfo = builder.transferArrAirportInfo;
            this.transferArrDate = builder.transferArrDate;
            this.transferDepAirportInfo = builder.transferDepAirportInfo;
            this.transferDepDate = builder.transferDepDate;
            this.transferFlightNo = builder.transferFlightNo;
            this.transferFlightRuleList = builder.transferFlightRuleList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TransferInfo create() {
            return builder().build();
        }

        /**
         * @return flightSize
         */
        public String getFlightSize() {
            return this.flightSize;
        }

        /**
         * @return flightType
         */
        public String getFlightType() {
            return this.flightType;
        }

        /**
         * @return transferAirlineInfo
         */
        public TransferAirlineInfo getTransferAirlineInfo() {
            return this.transferAirlineInfo;
        }

        /**
         * @return transferArrAirportInfo
         */
        public TransferArrAirportInfo getTransferArrAirportInfo() {
            return this.transferArrAirportInfo;
        }

        /**
         * @return transferArrDate
         */
        public String getTransferArrDate() {
            return this.transferArrDate;
        }

        /**
         * @return transferDepAirportInfo
         */
        public TransferDepAirportInfo getTransferDepAirportInfo() {
            return this.transferDepAirportInfo;
        }

        /**
         * @return transferDepDate
         */
        public String getTransferDepDate() {
            return this.transferDepDate;
        }

        /**
         * @return transferFlightNo
         */
        public String getTransferFlightNo() {
            return this.transferFlightNo;
        }

        /**
         * @return transferFlightRuleList
         */
        public java.util.List < TransferFlightRuleList> getTransferFlightRuleList() {
            return this.transferFlightRuleList;
        }

        public static final class Builder {
            private String flightSize; 
            private String flightType; 
            private TransferAirlineInfo transferAirlineInfo; 
            private TransferArrAirportInfo transferArrAirportInfo; 
            private String transferArrDate; 
            private TransferDepAirportInfo transferDepAirportInfo; 
            private String transferDepDate; 
            private String transferFlightNo; 
            private java.util.List < TransferFlightRuleList> transferFlightRuleList; 

            /**
             * 机型
             */
            public Builder flightSize(String flightSize) {
                this.flightSize = flightSize;
                return this;
            }

            /**
             * 机型代码
             */
            public Builder flightType(String flightType) {
                this.flightType = flightType;
                return this;
            }

            /**
             * 第二程销售航司信息
             */
            public Builder transferAirlineInfo(TransferAirlineInfo transferAirlineInfo) {
                this.transferAirlineInfo = transferAirlineInfo;
                return this;
            }

            /**
             * 中转到达机场信息
             */
            public Builder transferArrAirportInfo(TransferArrAirportInfo transferArrAirportInfo) {
                this.transferArrAirportInfo = transferArrAirportInfo;
                return this;
            }

            /**
             * 中转到达时间 (第一程到达时间)
             */
            public Builder transferArrDate(String transferArrDate) {
                this.transferArrDate = transferArrDate;
                return this;
            }

            /**
             * 中转出发机场信息
             */
            public Builder transferDepAirportInfo(TransferDepAirportInfo transferDepAirportInfo) {
                this.transferDepAirportInfo = transferDepAirportInfo;
                return this;
            }

            /**
             * 中转起飞时间 (第二程起飞时间)
             */
            public Builder transferDepDate(String transferDepDate) {
                this.transferDepDate = transferDepDate;
                return this;
            }

            /**
             * 航班号，二程
             */
            public Builder transferFlightNo(String transferFlightNo) {
                this.transferFlightNo = transferFlightNo;
                return this;
            }

            /**
             * 第二程退改签规则列表
             */
            public Builder transferFlightRuleList(java.util.List < TransferFlightRuleList> transferFlightRuleList) {
                this.transferFlightRuleList = transferFlightRuleList;
                return this;
            }

            public TransferInfo build() {
                return new TransferInfo(this);
            } 

        } 

    }
    public static class FlightList extends TeaModel {
        @NameInMap("airline_info")
        private AirlineInfo airlineInfo;

        @NameInMap("arr_airport_info")
        private ArrAirportInfo arrAirportInfo;

        @NameInMap("arr_date")
        private String arrDate;

        @NameInMap("basic_cabin_price")
        private Integer basicCabinPrice;

        @NameInMap("build_price")
        private Integer buildPrice;

        @NameInMap("cabin")
        private String cabin;

        @NameInMap("cabin_class")
        private String cabinClass;

        @NameInMap("cabin_info_list")
        private java.util.List < CabinInfoList> cabinInfoList;

        @NameInMap("carrier_airline")
        private String carrierAirline;

        @NameInMap("carrier_no")
        private String carrierNo;

        @NameInMap("class_rule")
        private String classRule;

        @NameInMap("dep_airport_info")
        private DepAirportInfo depAirportInfo;

        @NameInMap("dep_city_code")
        private String depCityCode;

        @NameInMap("dep_date")
        private String depDate;

        @NameInMap("discount")
        private Integer discount;

        @NameInMap("flight_no")
        private String flightNo;

        @NameInMap("flight_rule_list")
        private java.util.List < FlightListFlightRuleList> flightRuleList;

        @NameInMap("flight_rule_list_str")
        private String flightRuleListStr;

        @NameInMap("flight_size")
        private String flightSize;

        @NameInMap("flight_type")
        private String flightType;

        @NameInMap("invoice_type")
        private Integer invoiceType;

        @NameInMap("is_protocol")
        private Boolean isProtocol;

        @NameInMap("is_share")
        private Boolean isShare;

        @NameInMap("is_stop")
        private Boolean isStop;

        @NameInMap("is_transfer")
        private Boolean isTransfer;

        @NameInMap("meal_desc")
        private String mealDesc;

        @NameInMap("memo")
        private String memo;

        @NameInMap("oil_price")
        private Integer oilPrice;

        @NameInMap("ota_item_id")
        private String otaItemId;

        @NameInMap("price")
        private Integer price;

        @NameInMap("product_type")
        private Long productType;

        @NameInMap("product_type_desc")
        private String productTypeDesc;

        @NameInMap("promotion_price")
        private String promotionPrice;

        @NameInMap("remained_seat_count")
        private String remainedSeatCount;

        @NameInMap("secret_params")
        private String secretParams;

        @NameInMap("segment_number")
        private String segmentNumber;

        @NameInMap("stop_arr_time")
        private String stopArrTime;

        @NameInMap("stop_city")
        private String stopCity;

        @NameInMap("stop_dep_time")
        private String stopDepTime;

        @NameInMap("ticket_price")
        private Integer ticketPrice;

        @NameInMap("total_price")
        private String totalPrice;

        @NameInMap("transfer_info")
        private TransferInfo transferInfo;

        @NameInMap("trip_type")
        private Integer tripType;

        private FlightList(Builder builder) {
            this.airlineInfo = builder.airlineInfo;
            this.arrAirportInfo = builder.arrAirportInfo;
            this.arrDate = builder.arrDate;
            this.basicCabinPrice = builder.basicCabinPrice;
            this.buildPrice = builder.buildPrice;
            this.cabin = builder.cabin;
            this.cabinClass = builder.cabinClass;
            this.cabinInfoList = builder.cabinInfoList;
            this.carrierAirline = builder.carrierAirline;
            this.carrierNo = builder.carrierNo;
            this.classRule = builder.classRule;
            this.depAirportInfo = builder.depAirportInfo;
            this.depCityCode = builder.depCityCode;
            this.depDate = builder.depDate;
            this.discount = builder.discount;
            this.flightNo = builder.flightNo;
            this.flightRuleList = builder.flightRuleList;
            this.flightRuleListStr = builder.flightRuleListStr;
            this.flightSize = builder.flightSize;
            this.flightType = builder.flightType;
            this.invoiceType = builder.invoiceType;
            this.isProtocol = builder.isProtocol;
            this.isShare = builder.isShare;
            this.isStop = builder.isStop;
            this.isTransfer = builder.isTransfer;
            this.mealDesc = builder.mealDesc;
            this.memo = builder.memo;
            this.oilPrice = builder.oilPrice;
            this.otaItemId = builder.otaItemId;
            this.price = builder.price;
            this.productType = builder.productType;
            this.productTypeDesc = builder.productTypeDesc;
            this.promotionPrice = builder.promotionPrice;
            this.remainedSeatCount = builder.remainedSeatCount;
            this.secretParams = builder.secretParams;
            this.segmentNumber = builder.segmentNumber;
            this.stopArrTime = builder.stopArrTime;
            this.stopCity = builder.stopCity;
            this.stopDepTime = builder.stopDepTime;
            this.ticketPrice = builder.ticketPrice;
            this.totalPrice = builder.totalPrice;
            this.transferInfo = builder.transferInfo;
            this.tripType = builder.tripType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlightList create() {
            return builder().build();
        }

        /**
         * @return airlineInfo
         */
        public AirlineInfo getAirlineInfo() {
            return this.airlineInfo;
        }

        /**
         * @return arrAirportInfo
         */
        public ArrAirportInfo getArrAirportInfo() {
            return this.arrAirportInfo;
        }

        /**
         * @return arrDate
         */
        public String getArrDate() {
            return this.arrDate;
        }

        /**
         * @return basicCabinPrice
         */
        public Integer getBasicCabinPrice() {
            return this.basicCabinPrice;
        }

        /**
         * @return buildPrice
         */
        public Integer getBuildPrice() {
            return this.buildPrice;
        }

        /**
         * @return cabin
         */
        public String getCabin() {
            return this.cabin;
        }

        /**
         * @return cabinClass
         */
        public String getCabinClass() {
            return this.cabinClass;
        }

        /**
         * @return cabinInfoList
         */
        public java.util.List < CabinInfoList> getCabinInfoList() {
            return this.cabinInfoList;
        }

        /**
         * @return carrierAirline
         */
        public String getCarrierAirline() {
            return this.carrierAirline;
        }

        /**
         * @return carrierNo
         */
        public String getCarrierNo() {
            return this.carrierNo;
        }

        /**
         * @return classRule
         */
        public String getClassRule() {
            return this.classRule;
        }

        /**
         * @return depAirportInfo
         */
        public DepAirportInfo getDepAirportInfo() {
            return this.depAirportInfo;
        }

        /**
         * @return depCityCode
         */
        public String getDepCityCode() {
            return this.depCityCode;
        }

        /**
         * @return depDate
         */
        public String getDepDate() {
            return this.depDate;
        }

        /**
         * @return discount
         */
        public Integer getDiscount() {
            return this.discount;
        }

        /**
         * @return flightNo
         */
        public String getFlightNo() {
            return this.flightNo;
        }

        /**
         * @return flightRuleList
         */
        public java.util.List < FlightListFlightRuleList> getFlightRuleList() {
            return this.flightRuleList;
        }

        /**
         * @return flightRuleListStr
         */
        public String getFlightRuleListStr() {
            return this.flightRuleListStr;
        }

        /**
         * @return flightSize
         */
        public String getFlightSize() {
            return this.flightSize;
        }

        /**
         * @return flightType
         */
        public String getFlightType() {
            return this.flightType;
        }

        /**
         * @return invoiceType
         */
        public Integer getInvoiceType() {
            return this.invoiceType;
        }

        /**
         * @return isProtocol
         */
        public Boolean getIsProtocol() {
            return this.isProtocol;
        }

        /**
         * @return isShare
         */
        public Boolean getIsShare() {
            return this.isShare;
        }

        /**
         * @return isStop
         */
        public Boolean getIsStop() {
            return this.isStop;
        }

        /**
         * @return isTransfer
         */
        public Boolean getIsTransfer() {
            return this.isTransfer;
        }

        /**
         * @return mealDesc
         */
        public String getMealDesc() {
            return this.mealDesc;
        }

        /**
         * @return memo
         */
        public String getMemo() {
            return this.memo;
        }

        /**
         * @return oilPrice
         */
        public Integer getOilPrice() {
            return this.oilPrice;
        }

        /**
         * @return otaItemId
         */
        public String getOtaItemId() {
            return this.otaItemId;
        }

        /**
         * @return price
         */
        public Integer getPrice() {
            return this.price;
        }

        /**
         * @return productType
         */
        public Long getProductType() {
            return this.productType;
        }

        /**
         * @return productTypeDesc
         */
        public String getProductTypeDesc() {
            return this.productTypeDesc;
        }

        /**
         * @return promotionPrice
         */
        public String getPromotionPrice() {
            return this.promotionPrice;
        }

        /**
         * @return remainedSeatCount
         */
        public String getRemainedSeatCount() {
            return this.remainedSeatCount;
        }

        /**
         * @return secretParams
         */
        public String getSecretParams() {
            return this.secretParams;
        }

        /**
         * @return segmentNumber
         */
        public String getSegmentNumber() {
            return this.segmentNumber;
        }

        /**
         * @return stopArrTime
         */
        public String getStopArrTime() {
            return this.stopArrTime;
        }

        /**
         * @return stopCity
         */
        public String getStopCity() {
            return this.stopCity;
        }

        /**
         * @return stopDepTime
         */
        public String getStopDepTime() {
            return this.stopDepTime;
        }

        /**
         * @return ticketPrice
         */
        public Integer getTicketPrice() {
            return this.ticketPrice;
        }

        /**
         * @return totalPrice
         */
        public String getTotalPrice() {
            return this.totalPrice;
        }

        /**
         * @return transferInfo
         */
        public TransferInfo getTransferInfo() {
            return this.transferInfo;
        }

        /**
         * @return tripType
         */
        public Integer getTripType() {
            return this.tripType;
        }

        public static final class Builder {
            private AirlineInfo airlineInfo; 
            private ArrAirportInfo arrAirportInfo; 
            private String arrDate; 
            private Integer basicCabinPrice; 
            private Integer buildPrice; 
            private String cabin; 
            private String cabinClass; 
            private java.util.List < CabinInfoList> cabinInfoList; 
            private String carrierAirline; 
            private String carrierNo; 
            private String classRule; 
            private DepAirportInfo depAirportInfo; 
            private String depCityCode; 
            private String depDate; 
            private Integer discount; 
            private String flightNo; 
            private java.util.List < FlightListFlightRuleList> flightRuleList; 
            private String flightRuleListStr; 
            private String flightSize; 
            private String flightType; 
            private Integer invoiceType; 
            private Boolean isProtocol; 
            private Boolean isShare; 
            private Boolean isStop; 
            private Boolean isTransfer; 
            private String mealDesc; 
            private String memo; 
            private Integer oilPrice; 
            private String otaItemId; 
            private Integer price; 
            private Long productType; 
            private String productTypeDesc; 
            private String promotionPrice; 
            private String remainedSeatCount; 
            private String secretParams; 
            private String segmentNumber; 
            private String stopArrTime; 
            private String stopCity; 
            private String stopDepTime; 
            private Integer ticketPrice; 
            private String totalPrice; 
            private TransferInfo transferInfo; 
            private Integer tripType; 

            /**
             * 必填项,AirlineInfo 销售航司信息
             */
            public Builder airlineInfo(AirlineInfo airlineInfo) {
                this.airlineInfo = airlineInfo;
                return this;
            }

            /**
             * 必填项,AirportInfo 到达机场信息
             */
            public Builder arrAirportInfo(ArrAirportInfo arrAirportInfo) {
                this.arrAirportInfo = arrAirportInfo;
                return this;
            }

            /**
             * 到达时间
             */
            public Builder arrDate(String arrDate) {
                this.arrDate = arrDate;
                return this;
            }

            /**
             * 舱位基准价
             */
            public Builder basicCabinPrice(Integer basicCabinPrice) {
                this.basicCabinPrice = basicCabinPrice;
                return this;
            }

            /**
             * 必填项,机建费（分）
             */
            public Builder buildPrice(Integer buildPrice) {
                this.buildPrice = buildPrice;
                return this;
            }

            /**
             * 必填项,舱位代码
             */
            public Builder cabin(String cabin) {
                this.cabin = cabin;
                return this;
            }

            /**
             * 必填项,舱等
             */
            public Builder cabinClass(String cabinClass) {
                this.cabinClass = cabinClass;
                return this;
            }

            /**
             * 多舱位价格
             */
            public Builder cabinInfoList(java.util.List < CabinInfoList> cabinInfoList) {
                this.cabinInfoList = cabinInfoList;
                return this;
            }

            /**
             * 承运航班信息（共享航班时有值）
             */
            public Builder carrierAirline(String carrierAirline) {
                this.carrierAirline = carrierAirline;
                return this;
            }

            /**
             * 承运航班信息（共享航班时有值）
             */
            public Builder carrierNo(String carrierNo) {
                this.carrierNo = carrierNo;
                return this;
            }

            /**
             * 退改签描述
             */
            public Builder classRule(String classRule) {
                this.classRule = classRule;
                return this;
            }

            /**
             * 必填项,AirportInfo 出发机场信息
             */
            public Builder depAirportInfo(DepAirportInfo depAirportInfo) {
                this.depAirportInfo = depAirportInfo;
                return this;
            }

            /**
             * 出发城市三字码
             */
            public Builder depCityCode(String depCityCode) {
                this.depCityCode = depCityCode;
                return this;
            }

            /**
             * 出发时间
             */
            public Builder depDate(String depDate) {
                this.depDate = depDate;
                return this;
            }

            /**
             * 折扣
             */
            public Builder discount(Integer discount) {
                this.discount = discount;
                return this;
            }

            /**
             * 必填项,销售航班号
             */
            public Builder flightNo(String flightNo) {
                this.flightNo = flightNo;
                return this;
            }

            /**
             * 退改签规则列表
             */
            public Builder flightRuleList(java.util.List < FlightListFlightRuleList> flightRuleList) {
                this.flightRuleList = flightRuleList;
                return this;
            }

            /**
             * 退改签规则列表json
             */
            public Builder flightRuleListStr(String flightRuleListStr) {
                this.flightRuleListStr = flightRuleListStr;
                return this;
            }

            /**
             * 机型
             */
            public Builder flightSize(String flightSize) {
                this.flightSize = flightSize;
                return this;
            }

            /**
             * 机型号
             */
            public Builder flightType(String flightType) {
                this.flightType = flightType;
                return this;
            }

            /**
             * 行程单类型
             */
            public Builder invoiceType(Integer invoiceType) {
                this.invoiceType = invoiceType;
                return this;
            }

            /**
             * 是否协议价
             */
            public Builder isProtocol(Boolean isProtocol) {
                this.isProtocol = isProtocol;
                return this;
            }

            /**
             * 必填项,是否共享航班
             */
            public Builder isShare(Boolean isShare) {
                this.isShare = isShare;
                return this;
            }

            /**
             * 必填项,是否经停
             */
            public Builder isStop(Boolean isStop) {
                this.isStop = isStop;
                return this;
            }

            /**
             * 必填项,是否中转
             */
            public Builder isTransfer(Boolean isTransfer) {
                this.isTransfer = isTransfer;
                return this;
            }

            /**
             * 餐食
             */
            public Builder mealDesc(String mealDesc) {
                this.mealDesc = mealDesc;
                return this;
            }

            /**
             * memo.
             */
            public Builder memo(String memo) {
                this.memo = memo;
                return this;
            }

            /**
             * 必填项,燃油费（分）
             */
            public Builder oilPrice(Integer oilPrice) {
                this.oilPrice = oilPrice;
                return this;
            }

            /**
             * ???id
             */
            public Builder otaItemId(String otaItemId) {
                this.otaItemId = otaItemId;
                return this;
            }

            /**
             * 必填项,销售票价（分）
             */
            public Builder price(Integer price) {
                this.price = price;
                return this;
            }

            /**
             * 产品类型
             */
            public Builder productType(Long productType) {
                this.productType = productType;
                return this;
            }

            /**
             * 产品类型描述（标准产品/非标准产品）
             */
            public Builder productTypeDesc(String productTypeDesc) {
                this.productTypeDesc = productTypeDesc;
                return this;
            }

            /**
             * 优惠价
             */
            public Builder promotionPrice(String promotionPrice) {
                this.promotionPrice = promotionPrice;
                return this;
            }

            /**
             * 必填项,剩余座位数
             */
            public Builder remainedSeatCount(String remainedSeatCount) {
                this.remainedSeatCount = remainedSeatCount;
                return this;
            }

            /**
             * 加密参数,包含agentId 登下单需要用到的参数信息
             */
            public Builder secretParams(String secretParams) {
                this.secretParams = secretParams;
                return this;
            }

            /**
             * 航段编号
             */
            public Builder segmentNumber(String segmentNumber) {
                this.segmentNumber = segmentNumber;
                return this;
            }

            /**
             * 经停落地时间
             */
            public Builder stopArrTime(String stopArrTime) {
                this.stopArrTime = stopArrTime;
                return this;
            }

            /**
             * 经停城市
             */
            public Builder stopCity(String stopCity) {
                this.stopCity = stopCity;
                return this;
            }

            /**
             * 经停起飞时间
             */
            public Builder stopDepTime(String stopDepTime) {
                this.stopDepTime = stopDepTime;
                return this;
            }

            /**
             * 必填项,票面价
             */
            public Builder ticketPrice(Integer ticketPrice) {
                this.ticketPrice = ticketPrice;
                return this;
            }

            /**
             * 必填项,总价
             */
            public Builder totalPrice(String totalPrice) {
                this.totalPrice = totalPrice;
                return this;
            }

            /**
             * 中转信息
             */
            public Builder transferInfo(TransferInfo transferInfo) {
                this.transferInfo = transferInfo;
                return this;
            }

            /**
             * 航线类型
             */
            public Builder tripType(Integer tripType) {
                this.tripType = tripType;
                return this;
            }

            public FlightList build() {
                return new FlightList(this);
            } 

        } 

    }
    public static class Module extends TeaModel {
        @NameInMap("flight_list")
        private java.util.List < FlightList> flightList;

        @NameInMap("is_replace_pnr")
        private Boolean isReplacePnr;

        private Module(Builder builder) {
            this.flightList = builder.flightList;
            this.isReplacePnr = builder.isReplacePnr;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return flightList
         */
        public java.util.List < FlightList> getFlightList() {
            return this.flightList;
        }

        /**
         * @return isReplacePnr
         */
        public Boolean getIsReplacePnr() {
            return this.isReplacePnr;
        }

        public static final class Builder {
            private java.util.List < FlightList> flightList; 
            private Boolean isReplacePnr; 

            /**
             * flight_list.
             */
            public Builder flightList(java.util.List < FlightList> flightList) {
                this.flightList = flightList;
                return this;
            }

            /**
             * 是否可更换PNR出票
             */
            public Builder isReplacePnr(Boolean isReplacePnr) {
                this.isReplacePnr = isReplacePnr;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
