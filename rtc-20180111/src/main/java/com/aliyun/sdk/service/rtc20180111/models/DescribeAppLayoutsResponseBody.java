// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAppLayoutsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAppLayoutsResponseBody</p>
 */
public class DescribeAppLayoutsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Layouts")
    private java.util.List < Layouts> layouts;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalNum")
    private Long totalNum;

    @com.aliyun.core.annotation.NameInMap("TotalPage")
    private Long totalPage;

    private DescribeAppLayoutsResponseBody(Builder builder) {
        this.layouts = builder.layouts;
        this.requestId = builder.requestId;
        this.totalNum = builder.totalNum;
        this.totalPage = builder.totalPage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAppLayoutsResponseBody create() {
        return builder().build();
    }

    /**
     * @return layouts
     */
    public java.util.List < Layouts> getLayouts() {
        return this.layouts;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalNum
     */
    public Long getTotalNum() {
        return this.totalNum;
    }

    /**
     * @return totalPage
     */
    public Long getTotalPage() {
        return this.totalPage;
    }

    public static final class Builder {
        private java.util.List < Layouts> layouts; 
        private String requestId; 
        private Long totalNum; 
        private Long totalPage; 

        /**
         * Layouts.
         */
        public Builder layouts(java.util.List < Layouts> layouts) {
            this.layouts = layouts;
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
         * TotalNum.
         */
        public Builder totalNum(Long totalNum) {
            this.totalNum = totalNum;
            return this;
        }

        /**
         * TotalPage.
         */
        public Builder totalPage(Long totalPage) {
            this.totalPage = totalPage;
            return this;
        }

        public DescribeAppLayoutsResponseBody build() {
            return new DescribeAppLayoutsResponseBody(this);
        } 

    } 

    public static class Panes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Height")
        private Float height;

        @com.aliyun.core.annotation.NameInMap("PaneId")
        private Integer paneId;

        @com.aliyun.core.annotation.NameInMap("Width")
        private Float width;

        @com.aliyun.core.annotation.NameInMap("X")
        private Float x;

        @com.aliyun.core.annotation.NameInMap("Y")
        private Float y;

        @com.aliyun.core.annotation.NameInMap("ZOrder")
        private Integer zOrder;

        private Panes(Builder builder) {
            this.height = builder.height;
            this.paneId = builder.paneId;
            this.width = builder.width;
            this.x = builder.x;
            this.y = builder.y;
            this.zOrder = builder.zOrder;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Panes create() {
            return builder().build();
        }

        /**
         * @return height
         */
        public Float getHeight() {
            return this.height;
        }

        /**
         * @return paneId
         */
        public Integer getPaneId() {
            return this.paneId;
        }

        /**
         * @return width
         */
        public Float getWidth() {
            return this.width;
        }

        /**
         * @return x
         */
        public Float getX() {
            return this.x;
        }

        /**
         * @return y
         */
        public Float getY() {
            return this.y;
        }

        /**
         * @return zOrder
         */
        public Integer getZOrder() {
            return this.zOrder;
        }

        public static final class Builder {
            private Float height; 
            private Integer paneId; 
            private Float width; 
            private Float x; 
            private Float y; 
            private Integer zOrder; 

            /**
             * Height.
             */
            public Builder height(Float height) {
                this.height = height;
                return this;
            }

            /**
             * PaneId.
             */
            public Builder paneId(Integer paneId) {
                this.paneId = paneId;
                return this;
            }

            /**
             * Width.
             */
            public Builder width(Float width) {
                this.width = width;
                return this;
            }

            /**
             * X.
             */
            public Builder x(Float x) {
                this.x = x;
                return this;
            }

            /**
             * Y.
             */
            public Builder y(Float y) {
                this.y = y;
                return this;
            }

            /**
             * ZOrder.
             */
            public Builder zOrder(Integer zOrder) {
                this.zOrder = zOrder;
                return this;
            }

            public Panes build() {
                return new Panes(this);
            } 

        } 

    }
    public static class Layouts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LayoutId")
        private String layoutId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Panes")
        private java.util.List < Panes> panes;

        private Layouts(Builder builder) {
            this.layoutId = builder.layoutId;
            this.name = builder.name;
            this.panes = builder.panes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Layouts create() {
            return builder().build();
        }

        /**
         * @return layoutId
         */
        public String getLayoutId() {
            return this.layoutId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return panes
         */
        public java.util.List < Panes> getPanes() {
            return this.panes;
        }

        public static final class Builder {
            private String layoutId; 
            private String name; 
            private java.util.List < Panes> panes; 

            /**
             * LayoutId.
             */
            public Builder layoutId(String layoutId) {
                this.layoutId = layoutId;
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
             * Panes.
             */
            public Builder panes(java.util.List < Panes> panes) {
                this.panes = panes;
                return this;
            }

            public Layouts build() {
                return new Layouts(this);
            } 

        } 

    }
}
