// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link GetLogsV2ResponseBody} extends {@link TeaModel}
 *
 * <p>GetLogsV2ResponseBody</p>
 */
public class GetLogsV2ResponseBody extends TeaModel {
    @NameInMap("data")
    private java.util.List < java.util.Map<String, String>> data;

    @NameInMap("meta")
    private Meta meta;

    private GetLogsV2ResponseBody(Builder builder) {
        this.data = builder.data;
        this.meta = builder.meta;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLogsV2ResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < java.util.Map<String, String>> getData() {
        return this.data;
    }

    /**
     * @return meta
     */
    public Meta getMeta() {
        return this.meta;
    }

    public static final class Builder {
        private java.util.List < java.util.Map<String, String>> data; 
        private Meta meta; 

        /**
         * data.
         */
        public Builder data(java.util.List < java.util.Map<String, String>> data) {
            this.data = data;
            return this;
        }

        /**
         * meta.
         */
        public Builder meta(Meta meta) {
            this.meta = meta;
            return this;
        }

        public GetLogsV2ResponseBody build() {
            return new GetLogsV2ResponseBody(this);
        } 

    } 

    public static class Meta extends TeaModel {
        @NameInMap("aggQuery")
        private String aggQuery;

        @NameInMap("count")
        private Integer count;

        @NameInMap("elapsedMillisecond")
        private Long elapsedMillisecond;

        @NameInMap("hasSQL")
        private Boolean hasSQL;

        @NameInMap("isAccurate")
        private Boolean isAccurate;

        @NameInMap("keys")
        private java.util.List < String > keys;

        @NameInMap("processedBytes")
        private Long processedBytes;

        @NameInMap("processedRows")
        private Integer processedRows;

        @NameInMap("progress")
        private String progress;

        @NameInMap("telementryType")
        private String telementryType;

        @NameInMap("terms")
        private java.util.List < java.util.Map<String, ?>> terms;

        @NameInMap("whereQuery")
        private String whereQuery;

        private Meta(Builder builder) {
            this.aggQuery = builder.aggQuery;
            this.count = builder.count;
            this.elapsedMillisecond = builder.elapsedMillisecond;
            this.hasSQL = builder.hasSQL;
            this.isAccurate = builder.isAccurate;
            this.keys = builder.keys;
            this.processedBytes = builder.processedBytes;
            this.processedRows = builder.processedRows;
            this.progress = builder.progress;
            this.telementryType = builder.telementryType;
            this.terms = builder.terms;
            this.whereQuery = builder.whereQuery;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Meta create() {
            return builder().build();
        }

        /**
         * @return aggQuery
         */
        public String getAggQuery() {
            return this.aggQuery;
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return elapsedMillisecond
         */
        public Long getElapsedMillisecond() {
            return this.elapsedMillisecond;
        }

        /**
         * @return hasSQL
         */
        public Boolean getHasSQL() {
            return this.hasSQL;
        }

        /**
         * @return isAccurate
         */
        public Boolean getIsAccurate() {
            return this.isAccurate;
        }

        /**
         * @return keys
         */
        public java.util.List < String > getKeys() {
            return this.keys;
        }

        /**
         * @return processedBytes
         */
        public Long getProcessedBytes() {
            return this.processedBytes;
        }

        /**
         * @return processedRows
         */
        public Integer getProcessedRows() {
            return this.processedRows;
        }

        /**
         * @return progress
         */
        public String getProgress() {
            return this.progress;
        }

        /**
         * @return telementryType
         */
        public String getTelementryType() {
            return this.telementryType;
        }

        /**
         * @return terms
         */
        public java.util.List < java.util.Map<String, ?>> getTerms() {
            return this.terms;
        }

        /**
         * @return whereQuery
         */
        public String getWhereQuery() {
            return this.whereQuery;
        }

        public static final class Builder {
            private String aggQuery; 
            private Integer count; 
            private Long elapsedMillisecond; 
            private Boolean hasSQL; 
            private Boolean isAccurate; 
            private java.util.List < String > keys; 
            private Long processedBytes; 
            private Integer processedRows; 
            private String progress; 
            private String telementryType; 
            private java.util.List < java.util.Map<String, ?>> terms; 
            private String whereQuery; 

            /**
             * aggQuery.
             */
            public Builder aggQuery(String aggQuery) {
                this.aggQuery = aggQuery;
                return this;
            }

            /**
             * count.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * elapsedMillisecond.
             */
            public Builder elapsedMillisecond(Long elapsedMillisecond) {
                this.elapsedMillisecond = elapsedMillisecond;
                return this;
            }

            /**
             * hasSQL.
             */
            public Builder hasSQL(Boolean hasSQL) {
                this.hasSQL = hasSQL;
                return this;
            }

            /**
             * isAccurate.
             */
            public Builder isAccurate(Boolean isAccurate) {
                this.isAccurate = isAccurate;
                return this;
            }

            /**
             * keys.
             */
            public Builder keys(java.util.List < String > keys) {
                this.keys = keys;
                return this;
            }

            /**
             * processedBytes.
             */
            public Builder processedBytes(Long processedBytes) {
                this.processedBytes = processedBytes;
                return this;
            }

            /**
             * processedRows.
             */
            public Builder processedRows(Integer processedRows) {
                this.processedRows = processedRows;
                return this;
            }

            /**
             * progress.
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * telementryType.
             */
            public Builder telementryType(String telementryType) {
                this.telementryType = telementryType;
                return this;
            }

            /**
             * terms.
             */
            public Builder terms(java.util.List < java.util.Map<String, ?>> terms) {
                this.terms = terms;
                return this;
            }

            /**
             * whereQuery.
             */
            public Builder whereQuery(String whereQuery) {
                this.whereQuery = whereQuery;
                return this;
            }

            public Meta build() {
                return new Meta(this);
            } 

        } 

    }
}
