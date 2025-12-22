// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

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
 * {@link ListUserAnalyzersResponseBody} extends {@link TeaModel}
 *
 * <p>ListUserAnalyzersResponseBody</p>
 */
public class ListUserAnalyzersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private java.util.List<Result> result;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Integer totalCount;

    private ListUserAnalyzersResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUserAnalyzersResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public java.util.List<Result> getResult() {
        return this.result;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<Result> result; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListUserAnalyzersResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>0A6EB64B-B4C8-CF02-810F-E660812972FF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The custom analyzer.</p>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/178934.html">UserAnalyzer</a>.</p>
         */
        public Builder result(java.util.List<Result> result) {
            this.result = result;
            return this;
        }

        /**
         * <p>The total number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListUserAnalyzersResponseBody build() {
            return new ListUserAnalyzersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListUserAnalyzersResponseBody} extends {@link TeaModel}
     *
     * <p>ListUserAnalyzersResponseBody</p>
     */
    public static class Dicts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("available")
        private Boolean available;

        @com.aliyun.core.annotation.NameInMap("created")
        private Integer created;

        @com.aliyun.core.annotation.NameInMap("entriesCount")
        private Integer entriesCount;

        @com.aliyun.core.annotation.NameInMap("entriesLimit")
        private Integer entriesLimit;

        @com.aliyun.core.annotation.NameInMap("id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("updated")
        private Integer updated;

        private Dicts(Builder builder) {
            this.available = builder.available;
            this.created = builder.created;
            this.entriesCount = builder.entriesCount;
            this.entriesLimit = builder.entriesLimit;
            this.id = builder.id;
            this.type = builder.type;
            this.updated = builder.updated;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Dicts create() {
            return builder().build();
        }

        /**
         * @return available
         */
        public Boolean getAvailable() {
            return this.available;
        }

        /**
         * @return created
         */
        public Integer getCreated() {
            return this.created;
        }

        /**
         * @return entriesCount
         */
        public Integer getEntriesCount() {
            return this.entriesCount;
        }

        /**
         * @return entriesLimit
         */
        public Integer getEntriesLimit() {
            return this.entriesLimit;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return updated
         */
        public Integer getUpdated() {
            return this.updated;
        }

        public static final class Builder {
            private Boolean available; 
            private Integer created; 
            private Integer entriesCount; 
            private Integer entriesLimit; 
            private String id; 
            private String type; 
            private Integer updated; 

            private Builder() {
            } 

            private Builder(Dicts model) {
                this.available = model.available;
                this.created = model.created;
                this.entriesCount = model.entriesCount;
                this.entriesLimit = model.entriesLimit;
                this.id = model.id;
                this.type = model.type;
                this.updated = model.updated;
            } 

            /**
             * <p>Indicates whether the application is available.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder available(Boolean available) {
                this.available = available;
                return this;
            }

            /**
             * <p>The timestamp when the application was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1588054131</p>
             */
            public Builder created(Integer created) {
                this.created = created;
                return this;
            }

            /**
             * <p>The number of intervention entries.</p>
             * 
             * <strong>example:</strong>
             * <p>-1</p>
             */
            public Builder entriesCount(Integer entriesCount) {
                this.entriesCount = entriesCount;
                return this;
            }

            /**
             * <p>The maximum number of intervention entries that can be created in the dictionary.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder entriesLimit(Integer entriesLimit) {
                this.entriesLimit = entriesLimit;
                return this;
            }

            /**
             * <p>The ID of the dictionary.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The type. Valid value:</p>
             * <ul>
             * <li>segment</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>segment</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The timestamp when the application was last updated.</p>
             * 
             * <strong>example:</strong>
             * <p>1588054131</p>
             */
            public Builder updated(Integer updated) {
                this.updated = updated;
                return this;
            }

            public Dicts build() {
                return new Dicts(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListUserAnalyzersResponseBody} extends {@link TeaModel}
     *
     * <p>ListUserAnalyzersResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("available")
        private Boolean available;

        @com.aliyun.core.annotation.NameInMap("business")
        private String business;

        @com.aliyun.core.annotation.NameInMap("created")
        private Integer created;

        @com.aliyun.core.annotation.NameInMap("dicts")
        private java.util.List<Dicts> dicts;

        @com.aliyun.core.annotation.NameInMap("id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("updated")
        private Integer updated;

        private Result(Builder builder) {
            this.available = builder.available;
            this.business = builder.business;
            this.created = builder.created;
            this.dicts = builder.dicts;
            this.id = builder.id;
            this.name = builder.name;
            this.updated = builder.updated;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return available
         */
        public Boolean getAvailable() {
            return this.available;
        }

        /**
         * @return business
         */
        public String getBusiness() {
            return this.business;
        }

        /**
         * @return created
         */
        public Integer getCreated() {
            return this.created;
        }

        /**
         * @return dicts
         */
        public java.util.List<Dicts> getDicts() {
            return this.dicts;
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
         * @return updated
         */
        public Integer getUpdated() {
            return this.updated;
        }

        public static final class Builder {
            private Boolean available; 
            private String business; 
            private Integer created; 
            private java.util.List<Dicts> dicts; 
            private String id; 
            private String name; 
            private Integer updated; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.available = model.available;
                this.business = model.business;
                this.created = model.created;
                this.dicts = model.dicts;
                this.id = model.id;
                this.name = model.name;
                this.updated = model.updated;
            } 

            /**
             * <p>Indicates whether the application is available.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder available(Boolean available) {
                this.available = available;
                return this;
            }

            /**
             * <p>The basic analyzer. Valid values:</p>
             * <ul>
             * <li>chn_standard: <a href="https://help.aliyun.com/document_detail/179424.html">a common analyzer in Chinese</a></li>
             * <li>chn_scene_name: an analyzer for person names in Chinese</li>
             * <li>chn_ecommerce: <a href="https://help.aliyun.com/document_detail/179424.html">an analyzer for E-commerce in Chinese</a></li>
             * <li>chn_it_content: <a href="https://help.aliyun.com/document_detail/179424.html">an analyzer for IT content in Chinese</a></li>
             * <li>en_min: a small-granularity analyzer in English</li>
             * <li>th_standard: a common analyzer in Thai</li>
             * <li>th_ecommerce: an analyzer for E-commerce in Thai</li>
             * <li>vn_standard: a common analyzer in Vietnamese</li>
             * <li>chn_community_it: an analyzer for IT community content in Chinese</li>
             * <li>chn_ecommerce_general: a common analyzer for the E-commerce industry in Chinese</li>
             * <li>chn_esports_general: a common analyzer for the gaming industry in Chinese</li>
             * <li>chn_edu_question: an analyzer for question search of the education industry in Chinese</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>chn_standard</p>
             */
            public Builder business(String business) {
                this.business = business;
                return this;
            }

            /**
             * <p>The timestamp when the application was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1588054131</p>
             */
            public Builder created(Integer created) {
                this.created = created;
                return this;
            }

            /**
             * <p>The dictionaries that are used by the custom analyzer.</p>
             * <p>For more information, see <a href="https://help.aliyun.com/document_detail/178933.html">UserDict</a>.</p>
             */
            public Builder dicts(java.util.List<Dicts> dicts) {
                this.dicts = dicts;
                return this;
            }

            /**
             * <p>The ID of the custom analyzer.</p>
             * 
             * <strong>example:</strong>
             * <p>1234</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the custom analyzer.</p>
             * 
             * <strong>example:</strong>
             * <p>kevin_test2</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The timestamp when the application was last updated.</p>
             * 
             * <strong>example:</strong>
             * <p>1588054131</p>
             */
            public Builder updated(Integer updated) {
                this.updated = updated;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
