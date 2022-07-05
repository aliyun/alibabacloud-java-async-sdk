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

    @Host
    @NameInMap("project")
    @Validation(required = true)
    private String project;

    private UpdateIndexRequest(Builder builder) {
        super(builder);
        this.logstore = builder.logstore;
        this.keys = builder.keys;
        this.line = builder.line;
        this.logReduce = builder.logReduce;
        this.logReduceBlackList = builder.logReduceBlackList;
        this.logReduceWhiteList = builder.logReduceWhiteList;
        this.maxTextLen = builder.maxTextLen;
        this.ttl = builder.ttl;
        this.project = builder.project;
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

    /**
     * @return project
     */
    public String getProject() {
        return this.project;
    }

    public static final class Builder extends Request.Builder<UpdateIndexRequest, Builder> {
        private String logstore; 
        private java.util.Map < String, KeysValue > keys; 
        private Line line; 
        private Boolean logReduce; 
        private java.util.List < String > logReduceBlackList; 
        private java.util.List < String > logReduceWhiteList; 
        private Integer maxTextLen; 
        private Integer ttl; 
        private String project; 

        private Builder() {
            super();
        } 

        private Builder(UpdateIndexRequest request) {
            super(request);
            this.logstore = request.logstore;
            this.keys = request.keys;
            this.line = request.line;
            this.logReduce = request.logReduce;
            this.logReduceBlackList = request.logReduceBlackList;
            this.logReduceWhiteList = request.logReduceWhiteList;
            this.maxTextLen = request.maxTextLen;
            this.ttl = request.ttl;
            this.project = request.project;
        } 

        /**
         * logstore 名称。
         */
        public Builder logstore(String logstore) {
            this.putPathParameter("logstore", logstore);
            this.logstore = logstore;
            return this;
        }

        /**
         * 字段索引配置，key为字段名称，value为字段索引配置。
         */
        public Builder keys(java.util.Map < String, KeysValue > keys) {
            this.putBodyParameter("keys", keys);
            this.keys = keys;
            return this;
        }

        /**
         * 配置全文索引。
         */
        public Builder line(Line line) {
            this.putBodyParameter("line", line);
            this.line = line;
            return this;
        }

        /**
         * 开启日志聚类，开启后白名单与黑名单至多生效其中一个。
         */
        public Builder logReduce(Boolean logReduce) {
            this.putBodyParameter("log_reduce", logReduce);
            this.logReduce = logReduce;
            return this;
        }

        /**
         * 日志聚类的聚类字段黑名单
         */
        public Builder logReduceBlackList(java.util.List < String > logReduceBlackList) {
            this.putBodyParameter("log_reduce_black_list", logReduceBlackList);
            this.logReduceBlackList = logReduceBlackList;
            return this;
        }

        /**
         * 日志聚类的聚类字段白名单
         */
        public Builder logReduceWhiteList(java.util.List < String > logReduceWhiteList) {
            this.putBodyParameter("log_reduce_white_list", logReduceWhiteList);
            this.logReduceWhiteList = logReduceWhiteList;
            return this;
        }

        /**
         * 统计字段的最大长度
         */
        public Builder maxTextLen(Integer maxTextLen) {
            this.putBodyParameter("max_text_len", maxTextLen);
            this.maxTextLen = maxTextLen;
            return this;
        }

        /**
         * 保存时间，单位为天
         */
        public Builder ttl(Integer ttl) {
            this.putBodyParameter("ttl", ttl);
            this.ttl = ttl;
            return this;
        }

        /**
         * project 名称。
         */
        public Builder project(String project) {
            this.putHostParameter("project", project);
            this.project = project;
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
             * 大小写敏感
             */
            public Builder caseSensitive(Boolean caseSensitive) {
                this.caseSensitive = caseSensitive;
                return this;
            }

            /**
             * 包含中文
             */
            public Builder chn(Boolean chn) {
                this.chn = chn;
                return this;
            }

            /**
             * 排除的字段列表，不能与include_keys同时指定。
             */
            public Builder excludeKeys(java.util.List < String > excludeKeys) {
                this.excludeKeys = excludeKeys;
                return this;
            }

            /**
             * 包含的字段列表，不能与exclude_keys同时指定。
             */
            public Builder includeKeys(java.util.List < String > includeKeys) {
                this.includeKeys = includeKeys;
                return this;
            }

            /**
             * 分词符列表。可以设置一个分词参数，指定这个字段按照哪一种方式分词。
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
