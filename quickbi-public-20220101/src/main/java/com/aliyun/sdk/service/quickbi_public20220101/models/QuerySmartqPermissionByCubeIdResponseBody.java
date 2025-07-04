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
 * {@link QuerySmartqPermissionByCubeIdResponseBody} extends {@link TeaModel}
 *
 * <p>QuerySmartqPermissionByCubeIdResponseBody</p>
 */
public class QuerySmartqPermissionByCubeIdResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QuerySmartqPermissionByCubeIdResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySmartqPermissionByCubeIdResponseBody create() {
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

        private Builder(QuerySmartqPermissionByCubeIdResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
            this.success = model.success;
        } 

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>617277******************ABA47E31</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Basic information of the dataset.</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Possible values:</p>
         * <ul>
         * <li>true: The request was successful.</li>
         * <li>false: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QuerySmartqPermissionByCubeIdResponseBody build() {
            return new QuerySmartqPermissionByCubeIdResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QuerySmartqPermissionByCubeIdResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySmartqPermissionByCubeIdResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CubeId")
        private String cubeId;

        @com.aliyun.core.annotation.NameInMap("CubeName")
        private String cubeName;

        @com.aliyun.core.annotation.NameInMap("HasPerssion")
        private Boolean hasPerssion;

        private Result(Builder builder) {
            this.cubeId = builder.cubeId;
            this.cubeName = builder.cubeName;
            this.hasPerssion = builder.hasPerssion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return cubeId
         */
        public String getCubeId() {
            return this.cubeId;
        }

        /**
         * @return cubeName
         */
        public String getCubeName() {
            return this.cubeName;
        }

        /**
         * @return hasPerssion
         */
        public Boolean getHasPerssion() {
            return this.hasPerssion;
        }

        public static final class Builder {
            private String cubeId; 
            private String cubeName; 
            private Boolean hasPerssion; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.cubeId = model.cubeId;
                this.cubeName = model.cubeName;
                this.hasPerssion = model.hasPerssion;
            } 

            /**
             * <p>Dataset ID.</p>
             * 
             * <strong>example:</strong>
             * <p>7c7223ae-****-3c744528014b</p>
             */
            public Builder cubeId(String cubeId) {
                this.cubeId = cubeId;
                return this;
            }

            /**
             * <p>Dataset name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder cubeName(String cubeName) {
                this.cubeName = cubeName;
                return this;
            }

            /**
             * <p>Whether the current user has permission for the smart question. Note: &quot;HasPerssion&quot; seems to be a typo, it should probably be &quot;HasPermission&quot;.</p>
             */
            public Builder hasPerssion(Boolean hasPerssion) {
                this.hasPerssion = hasPerssion;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
