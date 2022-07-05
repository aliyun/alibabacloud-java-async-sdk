// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link Chart} extends {@link TeaModel}
 *
 * <p>Chart</p>
 */
public class Chart extends TeaModel {
    @NameInMap("action")
    private java.util.Map < String, String > action;

    @NameInMap("display")
    @Validation(required = true)
    private Display display;

    @NameInMap("search")
    @Validation(required = true)
    private Search search;

    @NameInMap("title")
    @Validation(required = true)
    private String title;

    @NameInMap("type")
    @Validation(required = true)
    private String type;

    private Chart(Builder builder) {
        this.action = builder.action;
        this.display = builder.display;
        this.search = builder.search;
        this.title = builder.title;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Chart create() {
        return builder().build();
    }

    /**
     * @return action
     */
    public java.util.Map < String, String > getAction() {
        return this.action;
    }

    /**
     * @return display
     */
    public Display getDisplay() {
        return this.display;
    }

    /**
     * @return search
     */
    public Search getSearch() {
        return this.search;
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
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private java.util.Map < String, String > action; 
        private Display display; 
        private Search search; 
        private String title; 
        private String type; 

        /**
         * action
         */
        public Builder action(java.util.Map < String, String > action) {
            this.action = action;
            return this;
        }

        /**
         * 图表的显示配置
         */
        public Builder display(Display display) {
            this.display = display;
            return this;
        }

        /**
         * 查询配置
         */
        public Builder search(Search search) {
            this.search = search;
            return this;
        }

        /**
         * 图表标题
         */
        public Builder title(String title) {
            this.title = title;
            return this;
        }

        /**
         * 图标类型
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public Chart build() {
            return new Chart(this);
        } 

    } 

    public static class Display extends TeaModel {
        @NameInMap("height")
        @Validation(required = true)
        private Long height;

        @NameInMap("width")
        @Validation(required = true)
        private Long width;

        @NameInMap("xAxis")
        private java.util.List < String > xAxis;

        @NameInMap("xPos")
        @Validation(required = true)
        private Long xPos;

        @NameInMap("yAxis")
        private java.util.List < String > yAxis;

        @NameInMap("yPos")
        @Validation(required = true)
        private Long yPos;

        private Display(Builder builder) {
            this.height = builder.height;
            this.width = builder.width;
            this.xAxis = builder.xAxis;
            this.xPos = builder.xPos;
            this.yAxis = builder.yAxis;
            this.yPos = builder.yPos;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Display create() {
            return builder().build();
        }

        /**
         * @return height
         */
        public Long getHeight() {
            return this.height;
        }

        /**
         * @return width
         */
        public Long getWidth() {
            return this.width;
        }

        /**
         * @return xAxis
         */
        public java.util.List < String > getXAxis() {
            return this.xAxis;
        }

        /**
         * @return xPos
         */
        public Long getXPos() {
            return this.xPos;
        }

        /**
         * @return yAxis
         */
        public java.util.List < String > getYAxis() {
            return this.yAxis;
        }

        /**
         * @return yPos
         */
        public Long getYPos() {
            return this.yPos;
        }

        public static final class Builder {
            private Long height; 
            private Long width; 
            private java.util.List < String > xAxis; 
            private Long xPos; 
            private java.util.List < String > yAxis; 
            private Long yPos; 

            /**
             * 高度
             */
            public Builder height(Long height) {
                this.height = height;
                return this;
            }

            /**
             * 宽度
             */
            public Builder width(Long width) {
                this.width = width;
                return this;
            }

            /**
             * x 轴
             */
            public Builder xAxis(java.util.List < String > xAxis) {
                this.xAxis = xAxis;
                return this;
            }

            /**
             * x 坐标
             */
            public Builder xPos(Long xPos) {
                this.xPos = xPos;
                return this;
            }

            /**
             * y 轴
             */
            public Builder yAxis(java.util.List < String > yAxis) {
                this.yAxis = yAxis;
                return this;
            }

            /**
             * y 坐标
             */
            public Builder yPos(Long yPos) {
                this.yPos = yPos;
                return this;
            }

            public Display build() {
                return new Display(this);
            } 

        } 

    }
    public static class Search extends TeaModel {
        @NameInMap("end")
        @Validation(required = true)
        private String end;

        @NameInMap("logstore")
        @Validation(required = true)
        private String logstore;

        @NameInMap("query")
        @Validation(required = true)
        private String query;

        @NameInMap("start")
        @Validation(required = true)
        private String start;

        @NameInMap("topic")
        @Validation(required = true)
        private String topic;

        private Search(Builder builder) {
            this.end = builder.end;
            this.logstore = builder.logstore;
            this.query = builder.query;
            this.start = builder.start;
            this.topic = builder.topic;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Search create() {
            return builder().build();
        }

        /**
         * @return end
         */
        public String getEnd() {
            return this.end;
        }

        /**
         * @return logstore
         */
        public String getLogstore() {
            return this.logstore;
        }

        /**
         * @return query
         */
        public String getQuery() {
            return this.query;
        }

        /**
         * @return start
         */
        public String getStart() {
            return this.start;
        }

        /**
         * @return topic
         */
        public String getTopic() {
            return this.topic;
        }

        public static final class Builder {
            private String end; 
            private String logstore; 
            private String query; 
            private String start; 
            private String topic; 

            /**
             * 结束时间
             */
            public Builder end(String end) {
                this.end = end;
                return this;
            }

            /**
             * logstore 名称
             */
            public Builder logstore(String logstore) {
                this.logstore = logstore;
                return this;
            }

            /**
             * 查询语句
             */
            public Builder query(String query) {
                this.query = query;
                return this;
            }

            /**
             * 开始时间
             */
            public Builder start(String start) {
                this.start = start;
                return this;
            }

            /**
             * topic
             */
            public Builder topic(String topic) {
                this.topic = topic;
                return this;
            }

            public Search build() {
                return new Search(this);
            } 

        } 

    }
}
