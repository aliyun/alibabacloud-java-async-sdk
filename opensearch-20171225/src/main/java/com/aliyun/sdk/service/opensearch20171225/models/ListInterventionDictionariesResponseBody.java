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
 * {@link ListInterventionDictionariesResponseBody} extends {@link TeaModel}
 *
 * <p>ListInterventionDictionariesResponseBody</p>
 */
public class ListInterventionDictionariesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private java.util.List<Result> result;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Integer totalCount;

    private ListInterventionDictionariesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInterventionDictionariesResponseBody create() {
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

        private Builder(ListInterventionDictionariesResponseBody model) {
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
         * <p>The information about each intervention dictionary.</p>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/173608.html">InterventionDictionary</a>.</p>
         */
        public Builder result(java.util.List<Result> result) {
            this.result = result;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListInterventionDictionariesResponseBody build() {
            return new ListInterventionDictionariesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListInterventionDictionariesResponseBody} extends {@link TeaModel}
     *
     * <p>ListInterventionDictionariesResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("analyzer")
        private String analyzer;

        @com.aliyun.core.annotation.NameInMap("created")
        private Integer created;

        @com.aliyun.core.annotation.NameInMap("id")
        private Integer id;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("updated")
        private Integer updated;

        private Result(Builder builder) {
            this.analyzer = builder.analyzer;
            this.created = builder.created;
            this.id = builder.id;
            this.name = builder.name;
            this.type = builder.type;
            this.updated = builder.updated;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return analyzer
         */
        public String getAnalyzer() {
            return this.analyzer;
        }

        /**
         * @return created
         */
        public Integer getCreated() {
            return this.created;
        }

        /**
         * @return id
         */
        public Integer getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
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
            private String analyzer; 
            private Integer created; 
            private Integer id; 
            private String name; 
            private String type; 
            private Integer updated; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.analyzer = model.analyzer;
                this.created = model.created;
                this.id = model.id;
                this.name = model.name;
                this.type = model.type;
                this.updated = model.updated;
            } 

            /**
             * <p>The custom analyzer.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder analyzer(String analyzer) {
                this.analyzer = analyzer;
                return this;
            }

            /**
             * <p>The time when the intervention dictionary was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1539158325</p>
             */
            public Builder created(Integer created) {
                this.created = created;
                return this;
            }

            /**
             * <p>The ID of the intervention dictionary.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder id(Integer id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the intervention dictionary.</p>
             * 
             * <strong>example:</strong>
             * <p>tongyici</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The type of the intervention dictionary. Valid values:</p>
             * <ul>
             * <li>stopword: an intervention dictionary for stop word filtering</li>
             * <li>synonym: an intervention dictionary for synonym configuration</li>
             * <li>correction: an intervention dictionary for spelling correction</li>
             * <li>category_prediction: an intervention dictionary for category prediction</li>
             * <li>ner: an intervention dictionary for named entity recognition (NER)</li>
             * <li>term_weighting: an intervention dictionary for term weight analysis</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>synonym</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The time when the intervention dictionary was last updated.</p>
             * 
             * <strong>example:</strong>
             * <p>1539158313</p>
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
