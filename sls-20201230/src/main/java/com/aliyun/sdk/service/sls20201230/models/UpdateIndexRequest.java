// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link UpdateIndexRequest} extends {@link RequestModel}
 *
 * <p>UpdateIndexRequest</p>
 */
public class UpdateIndexRequest extends Request {
    @Host
    @NameInMap("project")
    @Validation(required = true)
    private String project;

    @Path
    @NameInMap("logstore")
    @Validation(required = true)
    private String logstore;

    @Body
    @NameInMap("keys")
    private java.util.Map < String, KeysValue > keys;

    @Body
    @NameInMap("line")
    private Line line;

    @Body
    @NameInMap("log_reduce")
    private Boolean logReduce;

    @Body
    @NameInMap("log_reduce_black_list")
    private java.util.List < String > logReduceBlackList;

    @Body
    @NameInMap("log_reduce_white_list")
    private java.util.List < String > logReduceWhiteList;

    @Body
    @NameInMap("max_text_len")
    private Integer maxTextLen;

    @Body
    @NameInMap("ttl")
    @Validation(required = true)
    private Integer ttl;

    private UpdateIndexRequest(Builder builder) {
        super(builder);
        this.project = builder.project;
        this.logstore = builder.logstore;
        this.keys = builder.keys;
        this.line = builder.line;
        this.logReduce = builder.logReduce;
        this.logReduceBlackList = builder.logReduceBlackList;
        this.logReduceWhiteList = builder.logReduceWhiteList;
        this.maxTextLen = builder.maxTextLen;
        this.ttl = builder.ttl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateIndexRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return project
     */
    public String getProject() {
        return this.project;
    }

    /**
     * @return logstore
     */
    public String getLogstore() {
        return this.logstore;
    }

    /**
     * @return keys
     */
    public java.util.Map < String, KeysValue > getKeys() {
        return this.keys;
    }

    /**
     * @return line
     */
    public Line getLine() {
        return this.line;
    }

    /**
     * @return logReduce
     */
    public Boolean getLogReduce() {
        return this.logReduce;
    }

    /**
     * @return logReduceBlackList
     */
    public java.util.List < String > getLogReduceBlackList() {
        return this.logReduceBlackList;
    }

    /**
     * @return logReduceWhiteList
     */
    public java.util.List < String > getLogReduceWhiteList() {
        return this.logReduceWhiteList;
    }

    /**
     * @return maxTextLen
     */
    public Integer getMaxTextLen() {
        return this.maxTextLen;
    }

    /**
     * @return ttl
     */
    public Integer getTtl() {
        return this.ttl;
    }

    public static final class Builder extends Request.Builder<UpdateIndexRequest, Builder> {
        private String project; 
        private String logstore; 
        private java.util.Map < String, KeysValue > keys; 
        private Line line; 
        private Boolean logReduce; 
        private java.util.List < String > logReduceBlackList; 
        private java.util.List < String > logReduceWhiteList; 
        private Integer maxTextLen; 
        private Integer ttl; 

        private Builder() {
            super();
        } 

        private Builder(UpdateIndexRequest request) {
            super(request);
            this.project = request.project;
            this.logstore = request.logstore;
            this.keys = request.keys;
            this.line = request.line;
            this.logReduce = request.logReduce;
            this.logReduceBlackList = request.logReduceBlackList;
            this.logReduceWhiteList = request.logReduceWhiteList;
            this.maxTextLen = request.maxTextLen;
            this.ttl = request.ttl;
        } 

        /**
         * The name of the project.
         */
        public Builder project(String project) {
            this.putHostParameter("project", project);
            this.project = project;
            return this;
        }

        /**
         * The name of the Logstore.
         */
        public Builder logstore(String logstore) {
            this.putPathParameter("logstore", logstore);
            this.logstore = logstore;
            return this;
        }

        /**
         * The configuration of field indexes. A field index is a key-value pair in which the key specifies the name of the field and the value specifies the index configuration of the field.
         */
        public Builder keys(java.util.Map < String, KeysValue > keys) {
            this.putBodyParameter("keys", keys);
            this.keys = keys;
            return this;
        }

        /**
         * The configuration of full-text indexes.
         */
        public Builder line(Line line) {
            this.putBodyParameter("line", line);
            this.line = line;
            return this;
        }

        /**
         * Specifies whether to turn on LogReduce. If you turn on LogReduce, only one of `log_reduce_white_list` and `log_reduce_black_list` takes effect.
         */
        public Builder logReduce(Boolean logReduce) {
            this.putBodyParameter("log_reduce", logReduce);
            this.logReduce = logReduce;
            return this;
        }

        /**
         * The fields in the blacklist that you want to use to cluster logs.
         */
        public Builder logReduceBlackList(java.util.List < String > logReduceBlackList) {
            this.putBodyParameter("log_reduce_black_list", logReduceBlackList);
            this.logReduceBlackList = logReduceBlackList;
            return this;
        }

        /**
         * The fields in the whitelist that you want to use to cluster logs.
         */
        public Builder logReduceWhiteList(java.util.List < String > logReduceWhiteList) {
            this.putBodyParameter("log_reduce_white_list", logReduceWhiteList);
            this.logReduceWhiteList = logReduceWhiteList;
            return this;
        }

        /**
         * The maximum length of a field value that can be retained.
         */
        public Builder maxTextLen(Integer maxTextLen) {
            this.putBodyParameter("max_text_len", maxTextLen);
            this.maxTextLen = maxTextLen;
            return this;
        }

        /**
         * The retention period of data. Unit: days. Valid values: 7, 30, and 90.
         */
        public Builder ttl(Integer ttl) {
            this.putBodyParameter("ttl", ttl);
            this.ttl = ttl;
            return this;
        }

        @Override
        public UpdateIndexRequest build() {
            return new UpdateIndexRequest(this);
        } 

    } 

    public static class Line extends TeaModel {
        @NameInMap("caseSensitive")
        @Validation(required = true)
        private Boolean caseSensitive;

        @NameInMap("chn")
        @Validation(required = true)
        private Boolean chn;

        @NameInMap("exclude_keys")
        private java.util.List < String > excludeKeys;

        @NameInMap("include_keys")
        private java.util.List < String > includeKeys;

        @NameInMap("token")
        @Validation(required = true)
        private java.util.List < String > token;

        private Line(Builder builder) {
            this.caseSensitive = builder.caseSensitive;
            this.chn = builder.chn;
            this.excludeKeys = builder.excludeKeys;
            this.includeKeys = builder.includeKeys;
            this.token = builder.token;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Line create() {
            return builder().build();
        }

        /**
         * @return caseSensitive
         */
        public Boolean getCaseSensitive() {
            return this.caseSensitive;
        }

        /**
         * @return chn
         */
        public Boolean getChn() {
            return this.chn;
        }

        /**
         * @return excludeKeys
         */
        public java.util.List < String > getExcludeKeys() {
            return this.excludeKeys;
        }

        /**
         * @return includeKeys
         */
        public java.util.List < String > getIncludeKeys() {
            return this.includeKeys;
        }

        /**
         * @return token
         */
        public java.util.List < String > getToken() {
            return this.token;
        }

        public static final class Builder {
            private Boolean caseSensitive; 
            private Boolean chn; 
            private java.util.List < String > excludeKeys; 
            private java.util.List < String > includeKeys; 
            private java.util.List < String > token; 

            /**
             * Specifies whether to enable case sensitivity. Valid values:
             * <p>
             * 
             * *   true
             * *   false
             */
            public Builder caseSensitive(Boolean caseSensitive) {
                this.caseSensitive = caseSensitive;
                return this;
            }

            /**
             * Specifies whether to include Chinese characters. Valid values:
             * <p>
             * 
             * *   true
             * *   false
             */
            public Builder chn(Boolean chn) {
                this.chn = chn;
                return this;
            }

            /**
             * The excluded fields. You cannot specify both include_keys and exclude_keys.
             */
            public Builder excludeKeys(java.util.List < String > excludeKeys) {
                this.excludeKeys = excludeKeys;
                return this;
            }

            /**
             * The included fields. You cannot specify both include_keys and exclude_keys.
             */
            public Builder includeKeys(java.util.List < String > includeKeys) {
                this.includeKeys = includeKeys;
                return this;
            }

            /**
             * The delimiters that are used to split text.
             */
            public Builder token(java.util.List < String > token) {
                this.token = token;
                return this;
            }

            public Line build() {
                return new Line(this);
            } 

        } 

    }
}
