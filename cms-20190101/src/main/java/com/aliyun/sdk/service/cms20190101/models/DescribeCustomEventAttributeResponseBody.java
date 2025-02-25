// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeCustomEventAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCustomEventAttributeResponseBody</p>
 */
public class DescribeCustomEventAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("CustomEvents")
    private CustomEvents customEvents;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    private DescribeCustomEventAttributeResponseBody(Builder builder) {
        this.code = builder.code;
        this.customEvents = builder.customEvents;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCustomEventAttributeResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return customEvents
     */
    public CustomEvents getCustomEvents() {
        return this.customEvents;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private CustomEvents customEvents; 
        private String message; 
        private String requestId; 
        private String success; 

        /**
         * <p>The HTTP status code.</p>
         * <blockquote>
         * <p> The status code 200 indicates that the call was successful.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The details of the custom event.</p>
         */
        public Builder customEvents(CustomEvents customEvents) {
            this.customEvents = customEvents;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>userId:173651113438**** and name:&quot;BABEL_CHECK&quot;</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>60912C8D-B340-4253-ADE7-61ACDFD25CFC</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful. Valid values:</p>
         * <ul>
         * <li>true: The call was successful.</li>
         * <li>false: The call failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public DescribeCustomEventAttributeResponseBody build() {
            return new DescribeCustomEventAttributeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCustomEventAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCustomEventAttributeResponseBody</p>
     */
    public static class CustomEvent extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Time")
        private String time;

        private CustomEvent(Builder builder) {
            this.content = builder.content;
            this.groupId = builder.groupId;
            this.id = builder.id;
            this.name = builder.name;
            this.time = builder.time;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomEvent create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return time
         */
        public String getTime() {
            return this.time;
        }

        public static final class Builder {
            private String content; 
            private String groupId; 
            private String id; 
            private String name; 
            private String time; 

            /**
             * <p>The content of the custom event.</p>
             * 
             * <strong>example:</strong>
             * <p>requestId:4975A6F3-19AC-4C01-BAD2-034DA07FEBB5, info:{&quot;autoPay&quot;:false,&quot;autoUseCoupon&quot;:false,&quot;bid&quot;:&quot;26842&quot;,&quot;buyerId&quot;:118935342242****,&quot;commodities&quot;:[{&quot;aliyunProduceCode&quot;:&quot;cms&quot;,&quot;chargeType&quot;:&quot;PREPAY&quot;,&quot;commodityCode&quot;:&quot;cms_call_num&quot;,&quot;components&quot;:[{&quot;componentCode&quot;:&quot;phone_count&quot;,&quot;instanceProperty&quot;:[{&quot;code&quot;:&quot;phone_count&quot;,&quot;value&quot;:&quot;500&quot;}],&quot;moduleAttrStatus&quot;:1}],&quot;duration&quot;:6,&quot;free&quot;:false,&quot;orderParams&quot;:{&quot;aliyunProduceCode&quot;:&quot;cms&quot;},&quot;orderType&quot;:&quot;BUY&quot;,&quot;prePayPostCharge&quot;:false,&quot;pricingCycle&quot;:&quot;Month&quot;,&quot;quantity&quot;:1,&quot;refundSpecCode&quot;:&quot;&quot;,&quot;renewChange&quot;:false,&quot;specCode&quot;:&quot;cms_call_num&quot;,&quot;specUpdate&quot;:false,&quot;syncToSubscription&quot;:false,&quot;upgradeInquireFinancialValue&quot;:true}],&quot;fromApp&quot;:&quot;commonbuy&quot;,&quot;orderParams&quot;:{&quot;priceCheck&quot;:&quot;true&quot;},&quot;payerId&quot;:118935342242****,&quot;requestId&quot;:&quot;ade3ad32-f58b-45d7-add4-ac542be3d8ec&quot;,&quot;skipChannel&quot;:false,&quot;userId&quot;:118935342242****}</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The ID of the application group.</p>
             * 
             * <strong>example:</strong>
             * <p>12345</p>
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>The ID of the custom event.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the custom event.</p>
             * 
             * <strong>example:</strong>
             * <p>BABEL_CHECK</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The time when the custom event occurred.</p>
             * <p>This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1552199984000</p>
             */
            public Builder time(String time) {
                this.time = time;
                return this;
            }

            public CustomEvent build() {
                return new CustomEvent(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCustomEventAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCustomEventAttributeResponseBody</p>
     */
    public static class CustomEvents extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustomEvent")
        private java.util.List < CustomEvent> customEvent;

        private CustomEvents(Builder builder) {
            this.customEvent = builder.customEvent;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomEvents create() {
            return builder().build();
        }

        /**
         * @return customEvent
         */
        public java.util.List < CustomEvent> getCustomEvent() {
            return this.customEvent;
        }

        public static final class Builder {
            private java.util.List < CustomEvent> customEvent; 

            /**
             * CustomEvent.
             */
            public Builder customEvent(java.util.List < CustomEvent> customEvent) {
                this.customEvent = customEvent;
                return this;
            }

            public CustomEvents build() {
                return new CustomEvents(this);
            } 

        } 

    }
}
