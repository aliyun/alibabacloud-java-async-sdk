// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

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
 * {@link ListRouteMapsResponseBody} extends {@link TeaModel}
 *
 * <p>ListRouteMapsResponseBody</p>
 */
public class ListRouteMapsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RouteMaps")
    private java.util.List<RouteMaps> routeMaps;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListRouteMapsResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.routeMaps = builder.routeMaps;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRouteMapsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return routeMaps
     */
    public java.util.List<RouteMaps> getRouteMaps() {
        return this.routeMaps;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private java.util.List<RouteMaps> routeMaps; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListRouteMapsResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.routeMaps = model.routeMaps;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The number of entries returned on each page. Default value: <strong>20</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token for the next query. Valid values:</p>
         * <ul>
         * <li>If <strong>NextToken</strong> is empty, no next query is available.</li>
         * <li>If <strong>NextToken</strong> returns a value, the value is the token for the next query.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>B2063B16-852B-5B66-B73D-4ED4D1A5E5C2</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about the route maps.</p>
         */
        public Builder routeMaps(java.util.List<RouteMaps> routeMaps) {
            this.routeMaps = routeMaps;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListRouteMapsResponseBody build() {
            return new ListRouteMapsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListRouteMapsResponseBody} extends {@link TeaModel}
     *
     * <p>ListRouteMapsResponseBody</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(Tag model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>jg</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListRouteMapsResponseBody} extends {@link TeaModel}
     *
     * <p>ListRouteMapsResponseBody</p>
     */
    public static class RouteMaps extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Direction")
        private String direction;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Integer priority;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("RouteMapId")
        private String routeMapId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Tag")
        private java.util.List<Tag> tag;

        @com.aliyun.core.annotation.NameInMap("Version")
        private Integer version;

        private RouteMaps(Builder builder) {
            this.creationTime = builder.creationTime;
            this.description = builder.description;
            this.direction = builder.direction;
            this.name = builder.name;
            this.priority = builder.priority;
            this.resourceGroupId = builder.resourceGroupId;
            this.routeMapId = builder.routeMapId;
            this.status = builder.status;
            this.tag = builder.tag;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RouteMaps create() {
            return builder().build();
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return direction
         */
        public String getDirection() {
            return this.direction;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return priority
         */
        public Integer getPriority() {
            return this.priority;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return routeMapId
         */
        public String getRouteMapId() {
            return this.routeMapId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tag
         */
        public java.util.List<Tag> getTag() {
            return this.tag;
        }

        /**
         * @return version
         */
        public Integer getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String creationTime; 
            private String description; 
            private String direction; 
            private String name; 
            private Integer priority; 
            private String resourceGroupId; 
            private String routeMapId; 
            private String status; 
            private java.util.List<Tag> tag; 
            private Integer version; 

            private Builder() {
            } 

            private Builder(RouteMaps model) {
                this.creationTime = model.creationTime;
                this.description = model.description;
                this.direction = model.direction;
                this.name = model.name;
                this.priority = model.priority;
                this.resourceGroupId = model.resourceGroupId;
                this.routeMapId = model.routeMapId;
                this.status = model.status;
                this.tag = model.tag;
                this.version = model.version;
            } 

            /**
             * <p>The time when the route map was created.</p>
             * <p>The time follows the ISO 8601 standard in the <code>YYYY-MM-DDThh:mmZ</code> format. The time is displayed in UTC.</p>
             * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
             * 
             * <strong>example:</strong>
             * <p>2026-03-28T02:29:19Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The description of the route map.</p>
             * 
             * <strong>example:</strong>
             * <p>desctest</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The direction of the route map. Valid values: </p>
             * <ul>
             * <li>Inbound: inbound.</li>
             * <li>Outbound: outbound.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Inbound</p>
             */
            public Builder direction(String direction) {
                this.direction = direction;
                return this;
            }

            /**
             * <p>The name of the route map.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The priority of the route map. A smaller value indicates a higher priority.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>The ID of the resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-acfmydlzjd6dlhi</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The ID of the route map.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-y40mxdvf7joc12****</p>
             */
            public Builder routeMapId(String routeMapId) {
                this.routeMapId = routeMapId;
                return this;
            }

            /**
             * <p>The status of the route map. Valid values:</p>
             * <ul>
             * <li><strong>Creating</strong>: The route map is being created.</li>
             * <li><strong>Updating</strong>: The route map is being updated.</li>
             * <li><strong>Active</strong>: The route map is available.</li>
             * <li><strong>Deleting</strong>: The route map is being deleted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Active</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The list of tags.</p>
             */
            public Builder tag(java.util.List<Tag> tag) {
                this.tag = tag;
                return this;
            }

            /**
             * <p>The version number of the route map configuration.
             * The version number increases each time the route map and its associated route map rules are modified.</p>
             * 
             * <strong>example:</strong>
             * <p>7</p>
             */
            public Builder version(Integer version) {
                this.version = version;
                return this;
            }

            public RouteMaps build() {
                return new RouteMaps(this);
            } 

        } 

    }
}
