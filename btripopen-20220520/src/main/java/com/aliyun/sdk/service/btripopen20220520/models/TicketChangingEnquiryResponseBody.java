// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TicketChangingEnquiryResponseBody} extends {@link TeaModel}
 *
 * <p>TicketChangingEnquiryResponseBody</p>
 */
public class TicketChangingEnquiryResponseBody extends TeaModel {
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

    private TicketChangingEnquiryResponseBody(Builder builder) {
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

    public static TicketChangingEnquiryResponseBody create() {
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

        public TicketChangingEnquiryResponseBody build() {
            return new TicketChangingEnquiryResponseBody(this);
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

        @NameInMap("imageDO")
        private ImageDO imageDO;

        @NameInMap("is_highlight")
        private Boolean isHighlight;

        @NameInMap("subTitle")
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
             * description.
             */
            public Builder description(Description description) {
                this.description = description;
                return this;
            }

            /**
             * imageDO.
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
             * subTitle.
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
    public static class BaggageSubContents extends TeaModel {
        @NameInMap("baggage_desc")
        private String baggageDesc;

        @NameInMap("icon")
        private String icon;

        @NameInMap("style")
        private Integer style;

        @NameInMap("sub_title")
        private String subTitle;

        private BaggageSubContents(Builder builder) {
            this.baggageDesc = builder.baggageDesc;
            this.icon = builder.icon;
            this.style = builder.style;
            this.subTitle = builder.subTitle;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BaggageSubContents create() {
            return builder().build();
        }

        /**
         * @return baggageDesc
         */
        public String getBaggageDesc() {
            return this.baggageDesc;
        }

        /**
         * @return icon
         */
        public String getIcon() {
            return this.icon;
        }

        /**
         * @return style
         */
        public Integer getStyle() {
            return this.style;
        }

        /**
         * @return subTitle
         */
        public String getSubTitle() {
            return this.subTitle;
        }

        public static final class Builder {
            private String baggageDesc; 
            private String icon; 
            private Integer style; 
            private String subTitle; 

            /**
             * baggage_desc.
             */
            public Builder baggageDesc(String baggageDesc) {
                this.baggageDesc = baggageDesc;
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
             * style.
             */
            public Builder style(Integer style) {
                this.style = style;
                return this;
            }

            /**
             * sub_title.
             */
            public Builder subTitle(String subTitle) {
                this.subTitle = subTitle;
                return this;
            }

            public BaggageSubContents build() {
                return new BaggageSubContents(this);
            } 

        } 

    }
    public static class BaggageSubItems extends TeaModel {
        @NameInMap("attributes")
        private java.util.Map < String, ? > attributes;

        @NameInMap("baggage_sub_content_visualizes")
        private java.util.List < BaggageSubContentVisualizes> baggageSubContentVisualizes;

        @NameInMap("baggage_sub_contents")
        private java.util.List < BaggageSubContents> baggageSubContents;

        @NameInMap("content")
        private String content;

        @NameInMap("is_struct")
        private Boolean isStruct;

        @NameInMap("ptc")
        private String ptc;

        @NameInMap("title")
        private String title;

        private BaggageSubItems(Builder builder) {
            this.attributes = builder.attributes;
            this.baggageSubContentVisualizes = builder.baggageSubContentVisualizes;
            this.baggageSubContents = builder.baggageSubContents;
            this.content = builder.content;
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
         * @return attributes
         */
        public java.util.Map < String, ? > getAttributes() {
            return this.attributes;
        }

        /**
         * @return baggageSubContentVisualizes
         */
        public java.util.List < BaggageSubContentVisualizes> getBaggageSubContentVisualizes() {
            return this.baggageSubContentVisualizes;
        }

        /**
         * @return baggageSubContents
         */
        public java.util.List < BaggageSubContents> getBaggageSubContents() {
            return this.baggageSubContents;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
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
            private java.util.Map < String, ? > attributes; 
            private java.util.List < BaggageSubContentVisualizes> baggageSubContentVisualizes; 
            private java.util.List < BaggageSubContents> baggageSubContents; 
            private String content; 
            private Boolean isStruct; 
            private String ptc; 
            private String title; 

            /**
             * attributes.
             */
            public Builder attributes(java.util.Map < String, ? > attributes) {
                this.attributes = attributes;
                return this;
            }

            /**
             * baggage_sub_content_visualizes.
             */
            public Builder baggageSubContentVisualizes(java.util.List < BaggageSubContentVisualizes> baggageSubContentVisualizes) {
                this.baggageSubContentVisualizes = baggageSubContentVisualizes;
                return this;
            }

            /**
             * baggage_sub_contents.
             */
            public Builder baggageSubContents(java.util.List < BaggageSubContents> baggageSubContents) {
                this.baggageSubContents = baggageSubContents;
                return this;
            }

            /**
             * content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * is_struct.
             */
            public Builder isStruct(Boolean isStruct) {
                this.isStruct = isStruct;
                return this;
            }

            /**
             * ptc.
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
    public static class BaggageDetails extends TeaModel {
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

        private BaggageDetails(Builder builder) {
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

        public static BaggageDetails create() {
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
             * index.
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
             * tips.
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

            public BaggageDetails build() {
                return new BaggageDetails(this);
            } 

        } 

    }
    public static class ExtraContents extends TeaModel {
        @NameInMap("content")
        private String content;

        @NameInMap("icon")
        private String icon;

        @NameInMap("title")
        private String title;

        private ExtraContents(Builder builder) {
            this.content = builder.content;
            this.icon = builder.icon;
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
         * @return icon
         */
        public String getIcon() {
            return this.icon;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String content; 
            private String icon; 
            private String title; 

            /**
             * content.
             */
            public Builder content(String content) {
                this.content = content;
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
        private String style;

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
        public String getStyle() {
            return this.style;
        }

        public static final class Builder {
            private String feeDesc; 
            private String feeRange; 
            private String style; 

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
            public Builder style(String style) {
                this.style = style;
                return this;
            }

            public RefundSubContents build() {
                return new RefundSubContents(this);
            } 

        } 

    }
    public static class RefundSubItems extends TeaModel {
        @NameInMap("content")
        private String content;

        @NameInMap("is_struct")
        private Boolean isStruct;

        @NameInMap("ptc")
        private String ptc;

        @NameInMap("refund_sub_contents")
        private java.util.List < RefundSubContents> refundSubContents;

        @NameInMap("title")
        private String title;

        private RefundSubItems(Builder builder) {
            this.content = builder.content;
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
         * @return content
         */
        public String getContent() {
            return this.content;
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
            private String content; 
            private Boolean isStruct; 
            private String ptc; 
            private java.util.List < RefundSubContents> refundSubContents; 
            private String title; 

            /**
             * content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * is_struct.
             */
            public Builder isStruct(Boolean isStruct) {
                this.isStruct = isStruct;
                return this;
            }

            /**
             * ptc.
             */
            public Builder ptc(String ptc) {
                this.ptc = ptc;
                return this;
            }

            /**
             * refund_sub_contents.
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
    public static class ChangeDetails extends TeaModel {
        @NameInMap("extra_contents")
        private java.util.List < ExtraContents> extraContents;

        @NameInMap("index")
        private Integer index;

        @NameInMap("refund_sub_items")
        private java.util.List < RefundSubItems> refundSubItems;

        @NameInMap("table_head")
        private String tableHead;

        @NameInMap("title")
        private String title;

        @NameInMap("type")
        private Integer type;

        private ChangeDetails(Builder builder) {
            this.extraContents = builder.extraContents;
            this.index = builder.index;
            this.refundSubItems = builder.refundSubItems;
            this.tableHead = builder.tableHead;
            this.title = builder.title;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ChangeDetails create() {
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
            private String tableHead; 
            private String title; 
            private Integer type; 

            /**
             * extra_contents.
             */
            public Builder extraContents(java.util.List < ExtraContents> extraContents) {
                this.extraContents = extraContents;
                return this;
            }

            /**
             * index.
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

            public ChangeDetails build() {
                return new ChangeDetails(this);
            } 

        } 

    }
    public static class RefundDetailsExtraContents extends TeaModel {
        @NameInMap("content")
        private String content;

        @NameInMap("icon")
        private String icon;

        @NameInMap("title")
        private String title;

        private RefundDetailsExtraContents(Builder builder) {
            this.content = builder.content;
            this.icon = builder.icon;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RefundDetailsExtraContents create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return icon
         */
        public String getIcon() {
            return this.icon;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String content; 
            private String icon; 
            private String title; 

            /**
             * content.
             */
            public Builder content(String content) {
                this.content = content;
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
             * title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public RefundDetailsExtraContents build() {
                return new RefundDetailsExtraContents(this);
            } 

        } 

    }
    public static class RefundSubItemsRefundSubContents extends TeaModel {
        @NameInMap("fee_desc")
        private String feeDesc;

        @NameInMap("fee_range")
        private String feeRange;

        @NameInMap("style")
        private String style;

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
        public String getStyle() {
            return this.style;
        }

        public static final class Builder {
            private String feeDesc; 
            private String feeRange; 
            private String style; 

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
            public Builder style(String style) {
                this.style = style;
                return this;
            }

            public RefundSubItemsRefundSubContents build() {
                return new RefundSubItemsRefundSubContents(this);
            } 

        } 

    }
    public static class RefundDetailsRefundSubItems extends TeaModel {
        @NameInMap("content")
        private String content;

        @NameInMap("is_struct")
        private Boolean isStruct;

        @NameInMap("ptc")
        private String ptc;

        @NameInMap("refund_sub_contents")
        private java.util.List < RefundSubItemsRefundSubContents> refundSubContents;

        @NameInMap("title")
        private String title;

        private RefundDetailsRefundSubItems(Builder builder) {
            this.content = builder.content;
            this.isStruct = builder.isStruct;
            this.ptc = builder.ptc;
            this.refundSubContents = builder.refundSubContents;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RefundDetailsRefundSubItems create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
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
            private String content; 
            private Boolean isStruct; 
            private String ptc; 
            private java.util.List < RefundSubItemsRefundSubContents> refundSubContents; 
            private String title; 

            /**
             * content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * is_struct.
             */
            public Builder isStruct(Boolean isStruct) {
                this.isStruct = isStruct;
                return this;
            }

            /**
             * ptc.
             */
            public Builder ptc(String ptc) {
                this.ptc = ptc;
                return this;
            }

            /**
             * refund_sub_contents.
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

            public RefundDetailsRefundSubItems build() {
                return new RefundDetailsRefundSubItems(this);
            } 

        } 

    }
    public static class RefundDetails extends TeaModel {
        @NameInMap("extra_contents")
        private java.util.List < RefundDetailsExtraContents> extraContents;

        @NameInMap("index")
        private Integer index;

        @NameInMap("refund_sub_items")
        private java.util.List < RefundDetailsRefundSubItems> refundSubItems;

        @NameInMap("table_head")
        private String tableHead;

        @NameInMap("title")
        private String title;

        @NameInMap("type")
        private Integer type;

        private RefundDetails(Builder builder) {
            this.extraContents = builder.extraContents;
            this.index = builder.index;
            this.refundSubItems = builder.refundSubItems;
            this.tableHead = builder.tableHead;
            this.title = builder.title;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RefundDetails create() {
            return builder().build();
        }

        /**
         * @return extraContents
         */
        public java.util.List < RefundDetailsExtraContents> getExtraContents() {
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
        public java.util.List < RefundDetailsRefundSubItems> getRefundSubItems() {
            return this.refundSubItems;
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
            private java.util.List < RefundDetailsExtraContents> extraContents; 
            private Integer index; 
            private java.util.List < RefundDetailsRefundSubItems> refundSubItems; 
            private String tableHead; 
            private String title; 
            private Integer type; 

            /**
             * extra_contents.
             */
            public Builder extraContents(java.util.List < RefundDetailsExtraContents> extraContents) {
                this.extraContents = extraContents;
                return this;
            }

            /**
             * index.
             */
            public Builder index(Integer index) {
                this.index = index;
                return this;
            }

            /**
             * refund_sub_items.
             */
            public Builder refundSubItems(java.util.List < RefundDetailsRefundSubItems> refundSubItems) {
                this.refundSubItems = refundSubItems;
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

            public RefundDetails build() {
                return new RefundDetails(this);
            } 

        } 

    }
    public static class ChangeOtaItemRuleRq extends TeaModel {
        @NameInMap("baggage_details")
        private java.util.List < BaggageDetails> baggageDetails;

        @NameInMap("change_details")
        private java.util.List < ChangeDetails> changeDetails;

        @NameInMap("refund_details")
        private java.util.List < RefundDetails> refundDetails;

        private ChangeOtaItemRuleRq(Builder builder) {
            this.baggageDetails = builder.baggageDetails;
            this.changeDetails = builder.changeDetails;
            this.refundDetails = builder.refundDetails;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ChangeOtaItemRuleRq create() {
            return builder().build();
        }

        /**
         * @return baggageDetails
         */
        public java.util.List < BaggageDetails> getBaggageDetails() {
            return this.baggageDetails;
        }

        /**
         * @return changeDetails
         */
        public java.util.List < ChangeDetails> getChangeDetails() {
            return this.changeDetails;
        }

        /**
         * @return refundDetails
         */
        public java.util.List < RefundDetails> getRefundDetails() {
            return this.refundDetails;
        }

        public static final class Builder {
            private java.util.List < BaggageDetails> baggageDetails; 
            private java.util.List < ChangeDetails> changeDetails; 
            private java.util.List < RefundDetails> refundDetails; 

            /**
             * baggage_details.
             */
            public Builder baggageDetails(java.util.List < BaggageDetails> baggageDetails) {
                this.baggageDetails = baggageDetails;
                return this;
            }

            /**
             * change_details.
             */
            public Builder changeDetails(java.util.List < ChangeDetails> changeDetails) {
                this.changeDetails = changeDetails;
                return this;
            }

            /**
             * refund_details.
             */
            public Builder refundDetails(java.util.List < RefundDetails> refundDetails) {
                this.refundDetails = refundDetails;
                return this;
            }

            public ChangeOtaItemRuleRq build() {
                return new ChangeOtaItemRuleRq(this);
            } 

        } 

    }
    public static class ModifyPriceList extends TeaModel {
        @NameInMap("passenger_type")
        private Integer passengerType;

        @NameInMap("ticket_price")
        private Integer ticketPrice;

        @NameInMap("upgrade_fee")
        private Integer upgradeFee;

        @NameInMap("upgrade_price")
        private Integer upgradePrice;

        private ModifyPriceList(Builder builder) {
            this.passengerType = builder.passengerType;
            this.ticketPrice = builder.ticketPrice;
            this.upgradeFee = builder.upgradeFee;
            this.upgradePrice = builder.upgradePrice;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ModifyPriceList create() {
            return builder().build();
        }

        /**
         * @return passengerType
         */
        public Integer getPassengerType() {
            return this.passengerType;
        }

        /**
         * @return ticketPrice
         */
        public Integer getTicketPrice() {
            return this.ticketPrice;
        }

        /**
         * @return upgradeFee
         */
        public Integer getUpgradeFee() {
            return this.upgradeFee;
        }

        /**
         * @return upgradePrice
         */
        public Integer getUpgradePrice() {
            return this.upgradePrice;
        }

        public static final class Builder {
            private Integer passengerType; 
            private Integer ticketPrice; 
            private Integer upgradeFee; 
            private Integer upgradePrice; 

            /**
             * 必填项，乘客类型
             */
            public Builder passengerType(Integer passengerType) {
                this.passengerType = passengerType;
                return this;
            }

            /**
             * 票价
             */
            public Builder ticketPrice(Integer ticketPrice) {
                this.ticketPrice = ticketPrice;
                return this;
            }

            /**
             * 必填项，改签手续费
             */
            public Builder upgradeFee(Integer upgradeFee) {
                this.upgradeFee = upgradeFee;
                return this;
            }

            /**
             * 必填项，升舱差价
             */
            public Builder upgradePrice(Integer upgradePrice) {
                this.upgradePrice = upgradePrice;
                return this;
            }

            public ModifyPriceList build() {
                return new ModifyPriceList(this);
            } 

        } 

    }
    public static class CabinList extends TeaModel {
        @NameInMap("cabin")
        private String cabin;

        @NameInMap("cabin_class")
        private String cabinClass;

        @NameInMap("cabin_desc")
        private String cabinDesc;

        @NameInMap("cabin_discount")
        private Integer cabinDiscount;

        @NameInMap("change_ota_item_rule_rq")
        private ChangeOtaItemRuleRq changeOtaItemRuleRq;

        @NameInMap("child_cabin")
        private String childCabin;

        @NameInMap("left_num")
        private String leftNum;

        @NameInMap("modify_price_list")
        private java.util.List < ModifyPriceList> modifyPriceList;

        @NameInMap("ota_itemid")
        private String otaItemid;

        private CabinList(Builder builder) {
            this.cabin = builder.cabin;
            this.cabinClass = builder.cabinClass;
            this.cabinDesc = builder.cabinDesc;
            this.cabinDiscount = builder.cabinDiscount;
            this.changeOtaItemRuleRq = builder.changeOtaItemRuleRq;
            this.childCabin = builder.childCabin;
            this.leftNum = builder.leftNum;
            this.modifyPriceList = builder.modifyPriceList;
            this.otaItemid = builder.otaItemid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CabinList create() {
            return builder().build();
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
         * @return cabinDesc
         */
        public String getCabinDesc() {
            return this.cabinDesc;
        }

        /**
         * @return cabinDiscount
         */
        public Integer getCabinDiscount() {
            return this.cabinDiscount;
        }

        /**
         * @return changeOtaItemRuleRq
         */
        public ChangeOtaItemRuleRq getChangeOtaItemRuleRq() {
            return this.changeOtaItemRuleRq;
        }

        /**
         * @return childCabin
         */
        public String getChildCabin() {
            return this.childCabin;
        }

        /**
         * @return leftNum
         */
        public String getLeftNum() {
            return this.leftNum;
        }

        /**
         * @return modifyPriceList
         */
        public java.util.List < ModifyPriceList> getModifyPriceList() {
            return this.modifyPriceList;
        }

        /**
         * @return otaItemid
         */
        public String getOtaItemid() {
            return this.otaItemid;
        }

        public static final class Builder {
            private String cabin; 
            private String cabinClass; 
            private String cabinDesc; 
            private Integer cabinDiscount; 
            private ChangeOtaItemRuleRq changeOtaItemRuleRq; 
            private String childCabin; 
            private String leftNum; 
            private java.util.List < ModifyPriceList> modifyPriceList; 
            private String otaItemid; 

            /**
             * 必填项，舱位代码
             */
            public Builder cabin(String cabin) {
                this.cabin = cabin;
                return this;
            }

            /**
             * 必填项，舱等
             */
            public Builder cabinClass(String cabinClass) {
                this.cabinClass = cabinClass;
                return this;
            }

            /**
             * 必填项，舱位描述
             */
            public Builder cabinDesc(String cabinDesc) {
                this.cabinDesc = cabinDesc;
                return this;
            }

            /**
             * 舱等折扣，八折用80表示（null代表不限制）
             */
            public Builder cabinDiscount(Integer cabinDiscount) {
                this.cabinDiscount = cabinDiscount;
                return this;
            }

            /**
             * change_ota_item_rule_rq.
             */
            public Builder changeOtaItemRuleRq(ChangeOtaItemRuleRq changeOtaItemRuleRq) {
                this.changeOtaItemRuleRq = changeOtaItemRuleRq;
                return this;
            }

            /**
             * 必填项，子舱位
             */
            public Builder childCabin(String childCabin) {
                this.childCabin = childCabin;
                return this;
            }

            /**
             * 必填项，av
             */
            public Builder leftNum(String leftNum) {
                this.leftNum = leftNum;
                return this;
            }

            /**
             * 改签费用信息
             */
            public Builder modifyPriceList(java.util.List < ModifyPriceList> modifyPriceList) {
                this.modifyPriceList = modifyPriceList;
                return this;
            }

            /**
             * 商品Id"360379a11ee84e9aa011baa41b758fe6"
             */
            public Builder otaItemid(String otaItemid) {
                this.otaItemid = otaItemid;
                return this;
            }

            public CabinList build() {
                return new CabinList(this);
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
    public static class LowestCabinPrice extends TeaModel {
        @NameInMap("passenger_type")
        private Integer passengerType;

        @NameInMap("ticket_price")
        private Integer ticketPrice;

        @NameInMap("upgrade_fee")
        private Integer upgradeFee;

        @NameInMap("upgrade_price")
        private Integer upgradePrice;

        private LowestCabinPrice(Builder builder) {
            this.passengerType = builder.passengerType;
            this.ticketPrice = builder.ticketPrice;
            this.upgradeFee = builder.upgradeFee;
            this.upgradePrice = builder.upgradePrice;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LowestCabinPrice create() {
            return builder().build();
        }

        /**
         * @return passengerType
         */
        public Integer getPassengerType() {
            return this.passengerType;
        }

        /**
         * @return ticketPrice
         */
        public Integer getTicketPrice() {
            return this.ticketPrice;
        }

        /**
         * @return upgradeFee
         */
        public Integer getUpgradeFee() {
            return this.upgradeFee;
        }

        /**
         * @return upgradePrice
         */
        public Integer getUpgradePrice() {
            return this.upgradePrice;
        }

        public static final class Builder {
            private Integer passengerType; 
            private Integer ticketPrice; 
            private Integer upgradeFee; 
            private Integer upgradePrice; 

            /**
             * 必填项，乘客类型
             */
            public Builder passengerType(Integer passengerType) {
                this.passengerType = passengerType;
                return this;
            }

            /**
             * 票价
             */
            public Builder ticketPrice(Integer ticketPrice) {
                this.ticketPrice = ticketPrice;
                return this;
            }

            /**
             * 必填项，改签手续费
             */
            public Builder upgradeFee(Integer upgradeFee) {
                this.upgradeFee = upgradeFee;
                return this;
            }

            /**
             * 必填项，升舱差价
             */
            public Builder upgradePrice(Integer upgradePrice) {
                this.upgradePrice = upgradePrice;
                return this;
            }

            public LowestCabinPrice build() {
                return new LowestCabinPrice(this);
            } 

        } 

    }
    public static class FlightInfoList extends TeaModel {
        @NameInMap("airline_info")
        private AirlineInfo airlineInfo;

        @NameInMap("arr_airport_info")
        private ArrAirportInfo arrAirportInfo;

        @NameInMap("cabin_list")
        private java.util.List < CabinList> cabinList;

        @NameInMap("carrier_airline")
        private String carrierAirline;

        @NameInMap("carrier_no")
        private String carrierNo;

        @NameInMap("dep_airport_info")
        private DepAirportInfo depAirportInfo;

        @NameInMap("dep_city_code")
        private String depCityCode;

        @NameInMap("flight_no")
        private String flightNo;

        @NameInMap("is_share")
        private Boolean isShare;

        @NameInMap("lowest_cabin")
        private String lowestCabin;

        @NameInMap("lowest_cabin_class")
        private String lowestCabinClass;

        @NameInMap("lowest_cabin_desc")
        private String lowestCabinDesc;

        @NameInMap("lowest_cabin_num")
        private String lowestCabinNum;

        @NameInMap("lowest_cabin_price")
        private java.util.List < LowestCabinPrice> lowestCabinPrice;

        @NameInMap("modify_flight_arr_time")
        private String modifyFlightArrTime;

        @NameInMap("modify_flight_dep_date")
        private String modifyFlightDepDate;

        @NameInMap("modify_flight_dep_time")
        private String modifyFlightDepTime;

        @NameInMap("session_id")
        private String sessionId;

        private FlightInfoList(Builder builder) {
            this.airlineInfo = builder.airlineInfo;
            this.arrAirportInfo = builder.arrAirportInfo;
            this.cabinList = builder.cabinList;
            this.carrierAirline = builder.carrierAirline;
            this.carrierNo = builder.carrierNo;
            this.depAirportInfo = builder.depAirportInfo;
            this.depCityCode = builder.depCityCode;
            this.flightNo = builder.flightNo;
            this.isShare = builder.isShare;
            this.lowestCabin = builder.lowestCabin;
            this.lowestCabinClass = builder.lowestCabinClass;
            this.lowestCabinDesc = builder.lowestCabinDesc;
            this.lowestCabinNum = builder.lowestCabinNum;
            this.lowestCabinPrice = builder.lowestCabinPrice;
            this.modifyFlightArrTime = builder.modifyFlightArrTime;
            this.modifyFlightDepDate = builder.modifyFlightDepDate;
            this.modifyFlightDepTime = builder.modifyFlightDepTime;
            this.sessionId = builder.sessionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlightInfoList create() {
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
         * @return cabinList
         */
        public java.util.List < CabinList> getCabinList() {
            return this.cabinList;
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
         * @return flightNo
         */
        public String getFlightNo() {
            return this.flightNo;
        }

        /**
         * @return isShare
         */
        public Boolean getIsShare() {
            return this.isShare;
        }

        /**
         * @return lowestCabin
         */
        public String getLowestCabin() {
            return this.lowestCabin;
        }

        /**
         * @return lowestCabinClass
         */
        public String getLowestCabinClass() {
            return this.lowestCabinClass;
        }

        /**
         * @return lowestCabinDesc
         */
        public String getLowestCabinDesc() {
            return this.lowestCabinDesc;
        }

        /**
         * @return lowestCabinNum
         */
        public String getLowestCabinNum() {
            return this.lowestCabinNum;
        }

        /**
         * @return lowestCabinPrice
         */
        public java.util.List < LowestCabinPrice> getLowestCabinPrice() {
            return this.lowestCabinPrice;
        }

        /**
         * @return modifyFlightArrTime
         */
        public String getModifyFlightArrTime() {
            return this.modifyFlightArrTime;
        }

        /**
         * @return modifyFlightDepDate
         */
        public String getModifyFlightDepDate() {
            return this.modifyFlightDepDate;
        }

        /**
         * @return modifyFlightDepTime
         */
        public String getModifyFlightDepTime() {
            return this.modifyFlightDepTime;
        }

        /**
         * @return sessionId
         */
        public String getSessionId() {
            return this.sessionId;
        }

        public static final class Builder {
            private AirlineInfo airlineInfo; 
            private ArrAirportInfo arrAirportInfo; 
            private java.util.List < CabinList> cabinList; 
            private String carrierAirline; 
            private String carrierNo; 
            private DepAirportInfo depAirportInfo; 
            private String depCityCode; 
            private String flightNo; 
            private Boolean isShare; 
            private String lowestCabin; 
            private String lowestCabinClass; 
            private String lowestCabinDesc; 
            private String lowestCabinNum; 
            private java.util.List < LowestCabinPrice> lowestCabinPrice; 
            private String modifyFlightArrTime; 
            private String modifyFlightDepDate; 
            private String modifyFlightDepTime; 
            private String sessionId; 

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
             * 必填项,仓位列表
             */
            public Builder cabinList(java.util.List < CabinList> cabinList) {
                this.cabinList = cabinList;
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
             * 必填项,销售航班号
             */
            public Builder flightNo(String flightNo) {
                this.flightNo = flightNo;
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
             * 必填项,最低价舱位代码
             */
            public Builder lowestCabin(String lowestCabin) {
                this.lowestCabin = lowestCabin;
                return this;
            }

            /**
             * 必填项,最低价舱等
             */
            public Builder lowestCabinClass(String lowestCabinClass) {
                this.lowestCabinClass = lowestCabinClass;
                return this;
            }

            /**
             * 最低价舱位描述
             */
            public Builder lowestCabinDesc(String lowestCabinDesc) {
                this.lowestCabinDesc = lowestCabinDesc;
                return this;
            }

            /**
             * 必填项,最低价舱位av
             */
            public Builder lowestCabinNum(String lowestCabinNum) {
                this.lowestCabinNum = lowestCabinNum;
                return this;
            }

            /**
             * 必填项,最低价舱位改签价格
             */
            public Builder lowestCabinPrice(java.util.List < LowestCabinPrice> lowestCabinPrice) {
                this.lowestCabinPrice = lowestCabinPrice;
                return this;
            }

            /**
             * 改签航班到达时间
             */
            public Builder modifyFlightArrTime(String modifyFlightArrTime) {
                this.modifyFlightArrTime = modifyFlightArrTime;
                return this;
            }

            /**
             * 改签航班出发日期
             */
            public Builder modifyFlightDepDate(String modifyFlightDepDate) {
                this.modifyFlightDepDate = modifyFlightDepDate;
                return this;
            }

            /**
             * 改签航班出发时间
             */
            public Builder modifyFlightDepTime(String modifyFlightDepTime) {
                this.modifyFlightDepTime = modifyFlightDepTime;
                return this;
            }

            /**
             * ??id
             */
            public Builder sessionId(String sessionId) {
                this.sessionId = sessionId;
                return this;
            }

            public FlightInfoList build() {
                return new FlightInfoList(this);
            } 

        } 

    }
    public static class Module extends TeaModel {
        @NameInMap("flight_info_list")
        private java.util.List < FlightInfoList> flightInfoList;

        private Module(Builder builder) {
            this.flightInfoList = builder.flightInfoList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return flightInfoList
         */
        public java.util.List < FlightInfoList> getFlightInfoList() {
            return this.flightInfoList;
        }

        public static final class Builder {
            private java.util.List < FlightInfoList> flightInfoList; 

            /**
             * flight_info_list.
             */
            public Builder flightInfoList(java.util.List < FlightInfoList> flightInfoList) {
                this.flightInfoList = flightInfoList;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
