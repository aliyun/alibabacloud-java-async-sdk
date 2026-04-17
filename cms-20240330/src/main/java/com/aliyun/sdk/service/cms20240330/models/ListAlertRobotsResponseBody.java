// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link ListAlertRobotsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAlertRobotsResponseBody</p>
 */
public class ListAlertRobotsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("robots")
    private java.util.List<Robots> robots;

    @com.aliyun.core.annotation.NameInMap("total")
    private Long total;

    private ListAlertRobotsResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.robots = builder.robots;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAlertRobotsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return robots
     */
    public java.util.List<Robots> getRobots() {
        return this.robots;
    }

    /**
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private Long pageNumber; 
        private Long pageSize; 
        private String requestId; 
        private java.util.List<Robots> robots; 
        private Long total; 

        private Builder() {
        } 

        private Builder(ListAlertRobotsResponseBody model) {
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.robots = model.robots;
            this.total = model.total;
        } 

        /**
         * pageNumber.
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>8FDE2569-626B-5176-9844-28877A*****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * robots.
         */
        public Builder robots(java.util.List<Robots> robots) {
            this.robots = robots;
            return this;
        }

        /**
         * total.
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public ListAlertRobotsResponseBody build() {
            return new ListAlertRobotsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAlertRobotsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAlertRobotsResponseBody</p>
     */
    public static class Robots extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("digitalEmployeeName")
        private String digitalEmployeeName;

        @com.aliyun.core.annotation.NameInMap("lang")
        private String lang;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("robotId")
        private String robotId;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("url")
        private String url;

        @com.aliyun.core.annotation.NameInMap("workspace")
        private String workspace;

        private Robots(Builder builder) {
            this.digitalEmployeeName = builder.digitalEmployeeName;
            this.lang = builder.lang;
            this.name = builder.name;
            this.robotId = builder.robotId;
            this.type = builder.type;
            this.url = builder.url;
            this.workspace = builder.workspace;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Robots create() {
            return builder().build();
        }

        /**
         * @return digitalEmployeeName
         */
        public String getDigitalEmployeeName() {
            return this.digitalEmployeeName;
        }

        /**
         * @return lang
         */
        public String getLang() {
            return this.lang;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return robotId
         */
        public String getRobotId() {
            return this.robotId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        /**
         * @return workspace
         */
        public String getWorkspace() {
            return this.workspace;
        }

        public static final class Builder {
            private String digitalEmployeeName; 
            private String lang; 
            private String name; 
            private String robotId; 
            private String type; 
            private String url; 
            private String workspace; 

            private Builder() {
            } 

            private Builder(Robots model) {
                this.digitalEmployeeName = model.digitalEmployeeName;
                this.lang = model.lang;
                this.name = model.name;
                this.robotId = model.robotId;
                this.type = model.type;
                this.url = model.url;
                this.workspace = model.workspace;
            } 

            /**
             * digitalEmployeeName.
             */
            public Builder digitalEmployeeName(String digitalEmployeeName) {
                this.digitalEmployeeName = digitalEmployeeName;
                return this;
            }

            /**
             * lang.
             */
            public Builder lang(String lang) {
                this.lang = lang;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * robotId.
             */
            public Builder robotId(String robotId) {
                this.robotId = robotId;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            /**
             * workspace.
             */
            public Builder workspace(String workspace) {
                this.workspace = workspace;
                return this;
            }

            public Robots build() {
                return new Robots(this);
            } 

        } 

    }
}
