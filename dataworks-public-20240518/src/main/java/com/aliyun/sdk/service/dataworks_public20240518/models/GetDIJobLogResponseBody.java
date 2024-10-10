// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetDIJobLogResponseBody} extends {@link TeaModel}
 *
 * <p>GetDIJobLogResponseBody</p>
 */
public class GetDIJobLogResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Log")
    private String log;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetDIJobLogResponseBody(Builder builder) {
        this.log = builder.log;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDIJobLogResponseBody create() {
        return builder().build();
    }

    /**
     * @return log
     */
    public String getLog() {
        return this.log;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String log; 
        private String requestId; 

        /**
         * <p>代表资源一级ID的资源属性字段</p>
         * 
         * <strong>example:</strong>
         * <blockquote>
         * <blockquote>
         * <blockquote>
         * <blockquote>
         * <blockquote>
         * <blockquote>
         * <blockquote>
         * <blockquote>
         * <p>stdout:n++++++++++++++++++executing sql: create database if not exists jindo_test location &quot;oss://pangbei-hdfs/tmp/hive&quot; n++n</p>
         * </blockquote>
         * </blockquote>
         * </blockquote>
         * </blockquote>
         * </blockquote>
         * </blockquote>
         * </blockquote>
         * </blockquote>
         */
        public Builder log(String log) {
            this.log = log;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetDIJobLogResponseBody build() {
            return new GetDIJobLogResponseBody(this);
        } 

    } 

}
