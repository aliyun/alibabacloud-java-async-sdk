// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

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
 * {@link QueryLlmCubeWithThemeListByUserIdResponseBody} extends {@link TeaModel}
 *
 * <p>QueryLlmCubeWithThemeListByUserIdResponseBody</p>
 */
public class QueryLlmCubeWithThemeListByUserIdResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryLlmCubeWithThemeListByUserIdResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryLlmCubeWithThemeListByUserIdResponseBody create() {
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
    public Result getResult() {
        return this.result;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String requestId; 
        private Result result; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(QueryLlmCubeWithThemeListByUserIdResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
            this.success = model.success;
        } 

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2EE822B***************F-F5B42DDADC12</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>List of datasets and analysis themes.</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Possible values:</p>
         * <ul>
         * <li>true: The request was successful</li>
         * <li>false: The request failed</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryLlmCubeWithThemeListByUserIdResponseBody build() {
            return new QueryLlmCubeWithThemeListByUserIdResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryLlmCubeWithThemeListByUserIdResponseBody} extends {@link TeaModel}
     *
     * <p>QueryLlmCubeWithThemeListByUserIdResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CubeIds")
        private java.util.Map<String, String> cubeIds;

        @com.aliyun.core.annotation.NameInMap("ThemeIds")
        private java.util.Map<String, String> themeIds;

        private Result(Builder builder) {
            this.cubeIds = builder.cubeIds;
            this.themeIds = builder.themeIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return cubeIds
         */
        public java.util.Map<String, String> getCubeIds() {
            return this.cubeIds;
        }

        /**
         * @return themeIds
         */
        public java.util.Map<String, String> getThemeIds() {
            return this.themeIds;
        }

        public static final class Builder {
            private java.util.Map<String, String> cubeIds; 
            private java.util.Map<String, String> themeIds; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.cubeIds = model.cubeIds;
                this.themeIds = model.themeIds;
            } 

            /**
             * <p>Dataset map.</p>
             * <ul>
             * <li>key - Dataset ID</li>
             * <li>value - Dataset name</li>
             * </ul>
             */
            public Builder cubeIds(java.util.Map<String, String> cubeIds) {
                this.cubeIds = cubeIds;
                return this;
            }

            /**
             * <p>Analysis theme map.</p>
             * <ul>
             * <li>key - Analysis theme ID </li>
             * <li>value - Analysis theme name</li>
             * </ul>
             */
            public Builder themeIds(java.util.Map<String, String> themeIds) {
                this.themeIds = themeIds;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
