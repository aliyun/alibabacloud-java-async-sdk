// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMPULayoutInfoListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMPULayoutInfoListResponseBody</p>
 */
public class DescribeMPULayoutInfoListResponseBody extends TeaModel {
    @NameInMap("Layouts")
    private Layouts layouts;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalNum")
    private Long totalNum;

    @NameInMap("TotalPage")
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

    public static class Panes extends TeaModel {
        @NameInMap("Height")
        private Float height;

        @NameInMap("MajorPane")
        private Integer majorPane;

        @NameInMap("PaneId")
        private Integer paneId;

        @NameInMap("Width")
        private Float width;

        @NameInMap("X")
        private Float x;

        @NameInMap("Y")
        private Float y;

        @NameInMap("ZOrder")
        private Integer ZOrder;

        private Panes(Builder builder) {
            this.height = builder.height;
            this.majorPane = builder.majorPane;
            this.paneId = builder.paneId;
            this.width = builder.width;
            this.x = builder.x;
            this.y = builder.y;
            this.ZOrder = builder.ZOrder;
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
         * @return ZOrder
         */
        public Integer getZOrder() {
            return this.ZOrder;
        }

        public static final class Builder {
            private Float height; 
            private Integer majorPane; 
            private Integer paneId; 
            private Float width; 
            private Float x; 
            private Float y; 
            private Integer ZOrder; 

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
            public Builder ZOrder(Integer ZOrder) {
                this.ZOrder = ZOrder;
                return this;
            }

            public Panes build() {
                return new Panes(this);
            } 

        } 

    }
    public static class LayoutPanes extends TeaModel {
        @NameInMap("Panes")
        private java.util.List < Panes> panes;

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
        public java.util.List < Panes> getPanes() {
            return this.panes;
        }

        public static final class Builder {
            private java.util.List < Panes> panes; 

            /**
             * Panes.
             */
            public Builder panes(java.util.List < Panes> panes) {
                this.panes = panes;
                return this;
            }

            public LayoutPanes build() {
                return new LayoutPanes(this);
            } 

        } 

    }
    public static class Layout extends TeaModel {
        @NameInMap("AudioMixCount")
        private Integer audioMixCount;

        @NameInMap("LayoutId")
        private Long layoutId;

        @NameInMap("Name")
        private String name;

        @NameInMap("Panes")
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
    public static class Layouts extends TeaModel {
        @NameInMap("Layout")
        private java.util.List < Layout> layout;

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
        public java.util.List < Layout> getLayout() {
            return this.layout;
        }

        public static final class Builder {
            private java.util.List < Layout> layout; 

            /**
             * Layout.
             */
            public Builder layout(java.util.List < Layout> layout) {
                this.layout = layout;
                return this;
            }

            public Layouts build() {
                return new Layouts(this);
            } 

        } 

    }
}
