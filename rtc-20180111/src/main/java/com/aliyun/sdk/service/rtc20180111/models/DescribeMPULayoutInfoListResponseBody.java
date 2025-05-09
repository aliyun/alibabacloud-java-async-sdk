// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

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
 * {@link DescribeMPULayoutInfoListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMPULayoutInfoListResponseBody</p>
 */
public class DescribeMPULayoutInfoListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Layouts")
    private Layouts layouts;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalNum")
    private Long totalNum;

    @com.aliyun.core.annotation.NameInMap("TotalPage")
    private Long totalPage;

    private DescribeMPULayoutInfoListResponseBody(Builder builder) {
        this.layouts = builder.layouts;
        this.requestId = builder.requestId;
        this.totalNum = builder.totalNum;
        this.totalPage = builder.totalPage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMPULayoutInfoListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return layouts
     */
    public Layouts getLayouts() {
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
        private Layouts layouts; 
        private String requestId; 
        private Long totalNum; 
        private Long totalPage; 

        private Builder() {
        } 

        private Builder(DescribeMPULayoutInfoListResponseBody model) {
            this.layouts = model.layouts;
            this.requestId = model.requestId;
            this.totalNum = model.totalNum;
            this.totalPage = model.totalPage;
        } 

        /**
         * Layouts.
         */
        public Builder layouts(Layouts layouts) {
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

        public DescribeMPULayoutInfoListResponseBody build() {
            return new DescribeMPULayoutInfoListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeMPULayoutInfoListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMPULayoutInfoListResponseBody</p>
     */
    public static class Panes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Height")
        private Float height;

        @com.aliyun.core.annotation.NameInMap("MajorPane")
        private Integer majorPane;

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
            this.majorPane = builder.majorPane;
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
         * @return majorPane
         */
        public Integer getMajorPane() {
            return this.majorPane;
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
            private Integer majorPane; 
            private Integer paneId; 
            private Float width; 
            private Float x; 
            private Float y; 
            private Integer zOrder; 

            private Builder() {
            } 

            private Builder(Panes model) {
                this.height = model.height;
                this.majorPane = model.majorPane;
                this.paneId = model.paneId;
                this.width = model.width;
                this.x = model.x;
                this.y = model.y;
                this.zOrder = model.zOrder;
            } 

            /**
             * Height.
             */
            public Builder height(Float height) {
                this.height = height;
                return this;
            }

            /**
             * MajorPane.
             */
            public Builder majorPane(Integer majorPane) {
                this.majorPane = majorPane;
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
    /**
     * 
     * {@link DescribeMPULayoutInfoListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMPULayoutInfoListResponseBody</p>
     */
    public static class LayoutPanes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Panes")
        private java.util.List<Panes> panes;

        private LayoutPanes(Builder builder) {
            this.panes = builder.panes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LayoutPanes create() {
            return builder().build();
        }

        /**
         * @return panes
         */
        public java.util.List<Panes> getPanes() {
            return this.panes;
        }

        public static final class Builder {
            private java.util.List<Panes> panes; 

            private Builder() {
            } 

            private Builder(LayoutPanes model) {
                this.panes = model.panes;
            } 

            /**
             * Panes.
             */
            public Builder panes(java.util.List<Panes> panes) {
                this.panes = panes;
                return this;
            }

            public LayoutPanes build() {
                return new LayoutPanes(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeMPULayoutInfoListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMPULayoutInfoListResponseBody</p>
     */
    public static class Layout extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AudioMixCount")
        private Integer audioMixCount;

        @com.aliyun.core.annotation.NameInMap("LayoutId")
        private Long layoutId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Panes")
        private LayoutPanes panes;

        private Layout(Builder builder) {
            this.audioMixCount = builder.audioMixCount;
            this.layoutId = builder.layoutId;
            this.name = builder.name;
            this.panes = builder.panes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Layout create() {
            return builder().build();
        }

        /**
         * @return audioMixCount
         */
        public Integer getAudioMixCount() {
            return this.audioMixCount;
        }

        /**
         * @return layoutId
         */
        public Long getLayoutId() {
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
        public LayoutPanes getPanes() {
            return this.panes;
        }

        public static final class Builder {
            private Integer audioMixCount; 
            private Long layoutId; 
            private String name; 
            private LayoutPanes panes; 

            private Builder() {
            } 

            private Builder(Layout model) {
                this.audioMixCount = model.audioMixCount;
                this.layoutId = model.layoutId;
                this.name = model.name;
                this.panes = model.panes;
            } 

            /**
             * AudioMixCount.
             */
            public Builder audioMixCount(Integer audioMixCount) {
                this.audioMixCount = audioMixCount;
                return this;
            }

            /**
             * LayoutId.
             */
            public Builder layoutId(Long layoutId) {
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
            public Builder panes(LayoutPanes panes) {
                this.panes = panes;
                return this;
            }

            public Layout build() {
                return new Layout(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeMPULayoutInfoListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMPULayoutInfoListResponseBody</p>
     */
    public static class Layouts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Layout")
        private java.util.List<Layout> layout;

        private Layouts(Builder builder) {
            this.layout = builder.layout;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Layouts create() {
            return builder().build();
        }

        /**
         * @return layout
         */
        public java.util.List<Layout> getLayout() {
            return this.layout;
        }

        public static final class Builder {
            private java.util.List<Layout> layout; 

            private Builder() {
            } 

            private Builder(Layouts model) {
                this.layout = model.layout;
            } 

            /**
             * Layout.
             */
            public Builder layout(java.util.List<Layout> layout) {
                this.layout = layout;
                return this;
            }

            public Layouts build() {
                return new Layouts(this);
            } 

        } 

    }
}
