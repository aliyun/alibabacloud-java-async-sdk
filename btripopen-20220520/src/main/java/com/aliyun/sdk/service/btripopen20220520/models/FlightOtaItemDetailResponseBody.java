// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FlightOtaItemDetailResponseBody} extends {@link TeaModel}
 *
 * <p>FlightOtaItemDetailResponseBody</p>
 */
public class FlightOtaItemDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("module")
    private Module module;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("traceId")
    private String traceId;

    private FlightOtaItemDetailResponseBody(Builder builder) {
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

    public static FlightOtaItemDetailResponseBody create() {
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
         * module
         */
        public Builder module(Module module) {
            this.module = module;
            return this;
        }

        /**
         * requestId
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
         * traceId
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public FlightOtaItemDetailResponseBody build() {
            return new FlightOtaItemDetailResponseBody(this);
        } 

    } 

    public static class Description extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("desc")
        private String desc;

        @com.aliyun.core.annotation.NameInMap("icon")
        private String icon;

        @com.aliyun.core.annotation.NameInMap("image")
        private String image;

        @com.aliyun.core.annotation.NameInMap("title")
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
        @com.aliyun.core.annotation.NameInMap("image")
        private String image;

        @com.aliyun.core.annotation.NameInMap("largest")
        private String largest;

        @com.aliyun.core.annotation.NameInMap("middle")
        private String middle;

        @com.aliyun.core.annotation.NameInMap("smallest")
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
        @com.aliyun.core.annotation.NameInMap("baggage_desc")
        private java.util.List < String > baggageDesc;

        @com.aliyun.core.annotation.NameInMap("baggage_sub_content_type")
        private Integer baggageSubContentType;

        @com.aliyun.core.annotation.NameInMap("description")
        private Description description;

        @com.aliyun.core.annotation.NameInMap("image_d_o")
        private ImageDO imageDO;

        @com.aliyun.core.annotation.NameInMap("is_highlight")
        private Boolean isHighlight;

        @com.aliyun.core.annotation.NameInMap("sub_title")
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
             * baggage_desc
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
             * image_d_o.
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
        @com.aliyun.core.annotation.NameInMap("baggage_sub_content_visualizes")
        private java.util.List < BaggageSubContentVisualizes> baggageSubContentVisualizes;

        @com.aliyun.core.annotation.NameInMap("extra_content_visualizes")
        private java.util.List < ? > extraContentVisualizes;

        @com.aliyun.core.annotation.NameInMap("is_struct")
        private Boolean isStruct;

        @com.aliyun.core.annotation.NameInMap("ptc")
        private String ptc;

        @com.aliyun.core.annotation.NameInMap("title")
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
             * baggage_sub_content_visualizes.
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
        @com.aliyun.core.annotation.NameInMap("logo")
        private String logo;

        @com.aliyun.core.annotation.NameInMap("tips_desc")
        private String tipsDesc;

        @com.aliyun.core.annotation.NameInMap("tips_image")
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
    public static class BaggageRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("baggage_sub_items")
        private java.util.List < BaggageSubItems> baggageSubItems;

        @com.aliyun.core.annotation.NameInMap("index")
        private Integer index;

        @com.aliyun.core.annotation.NameInMap("table_head")
        private String tableHead;

        @com.aliyun.core.annotation.NameInMap("tips")
        private Tips tips;

        @com.aliyun.core.annotation.NameInMap("title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("type")
        private Integer type;

        private BaggageRule(Builder builder) {
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

        public static BaggageRule create() {
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

            public BaggageRule build() {
                return new BaggageRule(this);
            } 

        } 

    }
    public static class ExtraContents extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("title")
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
        @com.aliyun.core.annotation.NameInMap("fee_desc")
        private String feeDesc;

        @com.aliyun.core.annotation.NameInMap("fee_range")
        private String feeRange;

        @com.aliyun.core.annotation.NameInMap("style")
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
        @com.aliyun.core.annotation.NameInMap("is_struct")
        private Boolean isStruct;

        @com.aliyun.core.annotation.NameInMap("ptc")
        private String ptc;

        @com.aliyun.core.annotation.NameInMap("refund_sub_contents")
        private java.util.List < RefundSubContents> refundSubContents;

        @com.aliyun.core.annotation.NameInMap("title")
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
    public static class ChangeRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("extra_contents")
        private java.util.List < ExtraContents> extraContents;

        @com.aliyun.core.annotation.NameInMap("flight_no")
        private String flightNo;

        @com.aliyun.core.annotation.NameInMap("free_baggage")
        private Integer freeBaggage;

        @com.aliyun.core.annotation.NameInMap("index")
        private Integer index;

        @com.aliyun.core.annotation.NameInMap("level")
        private Integer level;

        @com.aliyun.core.annotation.NameInMap("refund_sub_items")
        private java.util.List < RefundSubItems> refundSubItems;

        @com.aliyun.core.annotation.NameInMap("sub_table_head")
        private java.util.List < String > subTableHead;

        @com.aliyun.core.annotation.NameInMap("table_head")
        private String tableHead;

        @com.aliyun.core.annotation.NameInMap("title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("type")
        private Integer type;

        private ChangeRule(Builder builder) {
            this.extraContents = builder.extraContents;
            this.flightNo = builder.flightNo;
            this.freeBaggage = builder.freeBaggage;
            this.index = builder.index;
            this.level = builder.level;
            this.refundSubItems = builder.refundSubItems;
            this.subTableHead = builder.subTableHead;
            this.tableHead = builder.tableHead;
            this.title = builder.title;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ChangeRule create() {
            return builder().build();
        }

        /**
         * @return extraContents
         */
        public java.util.List < ExtraContents> getExtraContents() {
            return this.extraContents;
        }

        /**
         * @return flightNo
         */
        public String getFlightNo() {
            return this.flightNo;
        }

        /**
         * @return freeBaggage
         */
        public Integer getFreeBaggage() {
            return this.freeBaggage;
        }

        /**
         * @return index
         */
        public Integer getIndex() {
            return this.index;
        }

        /**
         * @return level
         */
        public Integer getLevel() {
            return this.level;
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
            private String flightNo; 
            private Integer freeBaggage; 
            private Integer index; 
            private Integer level; 
            private java.util.List < RefundSubItems> refundSubItems; 
            private java.util.List < String > subTableHead; 
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
             * flight_no.
             */
            public Builder flightNo(String flightNo) {
                this.flightNo = flightNo;
                return this;
            }

            /**
             * free_baggage.
             */
            public Builder freeBaggage(Integer freeBaggage) {
                this.freeBaggage = freeBaggage;
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
             * level.
             */
            public Builder level(Integer level) {
                this.level = level;
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
             * subTableHead
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

            public ChangeRule build() {
                return new ChangeRule(this);
            } 

        } 

    }
    public static class RefundRuleExtraContents extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("title")
        private String title;

        private RefundRuleExtraContents(Builder builder) {
            this.content = builder.content;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RefundRuleExtraContents create() {
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

            public RefundRuleExtraContents build() {
                return new RefundRuleExtraContents(this);
            } 

        } 

    }
    public static class RefundSubItemsRefundSubContents extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("fee_desc")
        private String feeDesc;

        @com.aliyun.core.annotation.NameInMap("fee_range")
        private String feeRange;

        @com.aliyun.core.annotation.NameInMap("style")
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
    public static class RefundRuleRefundSubItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("is_struct")
        private Boolean isStruct;

        @com.aliyun.core.annotation.NameInMap("ptc")
        private String ptc;

        @com.aliyun.core.annotation.NameInMap("refund_sub_contents")
        private java.util.List < RefundSubItemsRefundSubContents> refundSubContents;

        @com.aliyun.core.annotation.NameInMap("title")
        private String title;

        private RefundRuleRefundSubItems(Builder builder) {
            this.isStruct = builder.isStruct;
            this.ptc = builder.ptc;
            this.refundSubContents = builder.refundSubContents;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RefundRuleRefundSubItems create() {
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

            public RefundRuleRefundSubItems build() {
                return new RefundRuleRefundSubItems(this);
            } 

        } 

    }
    public static class RefundRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("extra_contents")
        private java.util.List < RefundRuleExtraContents> extraContents;

        @com.aliyun.core.annotation.NameInMap("flight_no")
        private String flightNo;

        @com.aliyun.core.annotation.NameInMap("free_baggage")
        private Integer freeBaggage;

        @com.aliyun.core.annotation.NameInMap("index")
        private Integer index;

        @com.aliyun.core.annotation.NameInMap("level")
        private Integer level;

        @com.aliyun.core.annotation.NameInMap("refund_sub_items")
        private java.util.List < RefundRuleRefundSubItems> refundSubItems;

        @com.aliyun.core.annotation.NameInMap("sub_table_head")
        private java.util.List < String > subTableHead;

        @com.aliyun.core.annotation.NameInMap("table_head")
        private String tableHead;

        @com.aliyun.core.annotation.NameInMap("title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("type")
        private Integer type;

        private RefundRule(Builder builder) {
            this.extraContents = builder.extraContents;
            this.flightNo = builder.flightNo;
            this.freeBaggage = builder.freeBaggage;
            this.index = builder.index;
            this.level = builder.level;
            this.refundSubItems = builder.refundSubItems;
            this.subTableHead = builder.subTableHead;
            this.tableHead = builder.tableHead;
            this.title = builder.title;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RefundRule create() {
            return builder().build();
        }

        /**
         * @return extraContents
         */
        public java.util.List < RefundRuleExtraContents> getExtraContents() {
            return this.extraContents;
        }

        /**
         * @return flightNo
         */
        public String getFlightNo() {
            return this.flightNo;
        }

        /**
         * @return freeBaggage
         */
        public Integer getFreeBaggage() {
            return this.freeBaggage;
        }

        /**
         * @return index
         */
        public Integer getIndex() {
            return this.index;
        }

        /**
         * @return level
         */
        public Integer getLevel() {
            return this.level;
        }

        /**
         * @return refundSubItems
         */
        public java.util.List < RefundRuleRefundSubItems> getRefundSubItems() {
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
            private java.util.List < RefundRuleExtraContents> extraContents; 
            private String flightNo; 
            private Integer freeBaggage; 
            private Integer index; 
            private Integer level; 
            private java.util.List < RefundRuleRefundSubItems> refundSubItems; 
            private java.util.List < String > subTableHead; 
            private String tableHead; 
            private String title; 
            private Integer type; 

            /**
             * extra_contents.
             */
            public Builder extraContents(java.util.List < RefundRuleExtraContents> extraContents) {
                this.extraContents = extraContents;
                return this;
            }

            /**
             * flight_no.
             */
            public Builder flightNo(String flightNo) {
                this.flightNo = flightNo;
                return this;
            }

            /**
             * free_baggage.
             */
            public Builder freeBaggage(Integer freeBaggage) {
                this.freeBaggage = freeBaggage;
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
             * level.
             */
            public Builder level(Integer level) {
                this.level = level;
                return this;
            }

            /**
             * refund_sub_items.
             */
            public Builder refundSubItems(java.util.List < RefundRuleRefundSubItems> refundSubItems) {
                this.refundSubItems = refundSubItems;
                return this;
            }

            /**
             * subTableHead
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

            public RefundRule build() {
                return new RefundRule(this);
            } 

        } 

    }
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("baggage_rule")
        private java.util.List < BaggageRule> baggageRule;

        @com.aliyun.core.annotation.NameInMap("change_rule")
        private java.util.List < ChangeRule> changeRule;

        @com.aliyun.core.annotation.NameInMap("refund_rule")
        private java.util.List < RefundRule> refundRule;

        @com.aliyun.core.annotation.NameInMap("sell_price")
        private Integer sellPrice;

        @com.aliyun.core.annotation.NameInMap("sell_price_list")
        private java.util.List < Integer > sellPriceList;

        @com.aliyun.core.annotation.NameInMap("trip_type")
        private Integer tripType;

        private Module(Builder builder) {
            this.baggageRule = builder.baggageRule;
            this.changeRule = builder.changeRule;
            this.refundRule = builder.refundRule;
            this.sellPrice = builder.sellPrice;
            this.sellPriceList = builder.sellPriceList;
            this.tripType = builder.tripType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return baggageRule
         */
        public java.util.List < BaggageRule> getBaggageRule() {
            return this.baggageRule;
        }

        /**
         * @return changeRule
         */
        public java.util.List < ChangeRule> getChangeRule() {
            return this.changeRule;
        }

        /**
         * @return refundRule
         */
        public java.util.List < RefundRule> getRefundRule() {
            return this.refundRule;
        }

        /**
         * @return sellPrice
         */
        public Integer getSellPrice() {
            return this.sellPrice;
        }

        /**
         * @return sellPriceList
         */
        public java.util.List < Integer > getSellPriceList() {
            return this.sellPriceList;
        }

        /**
         * @return tripType
         */
        public Integer getTripType() {
            return this.tripType;
        }

        public static final class Builder {
            private java.util.List < BaggageRule> baggageRule; 
            private java.util.List < ChangeRule> changeRule; 
            private java.util.List < RefundRule> refundRule; 
            private Integer sellPrice; 
            private java.util.List < Integer > sellPriceList; 
            private Integer tripType; 

            /**
             * baggage_rule.
             */
            public Builder baggageRule(java.util.List < BaggageRule> baggageRule) {
                this.baggageRule = baggageRule;
                return this;
            }

            /**
             * change_rule.
             */
            public Builder changeRule(java.util.List < ChangeRule> changeRule) {
                this.changeRule = changeRule;
                return this;
            }

            /**
             * refund_rule.
             */
            public Builder refundRule(java.util.List < RefundRule> refundRule) {
                this.refundRule = refundRule;
                return this;
            }

            /**
             * sell_price.
             */
            public Builder sellPrice(Integer sellPrice) {
                this.sellPrice = sellPrice;
                return this;
            }

            /**
             * sell_price_list.
             */
            public Builder sellPriceList(java.util.List < Integer > sellPriceList) {
                this.sellPriceList = sellPriceList;
                return this;
            }

            /**
             * trip_type.
             */
            public Builder tripType(Integer tripType) {
                this.tripType = tripType;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
