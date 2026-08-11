// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.modelstudio20260210.models;

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
 * {@link ListModelPermissionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListModelPermissionsResponseBody</p>
 */
public class ListModelPermissionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("errorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("list")
    private java.util.List<List> list;

    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Long totalCount;

    private ListModelPermissionsResponseBody(Builder builder) {
        this.code = builder.code;
        this.errorMessage = builder.errorMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.list = builder.list;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListModelPermissionsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return list
     */
    public java.util.List<List> getList() {
        return this.list;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private String errorMessage; 
        private Integer httpStatusCode; 
        private java.util.List<List> list; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Boolean success; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListModelPermissionsResponseBody model) {
            this.code = model.code;
            this.errorMessage = model.errorMessage;
            this.httpStatusCode = model.httpStatusCode;
            this.list = model.list;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.success = model.success;
            this.totalCount = model.totalCount;
        } 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * errorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * httpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * list.
         */
        public Builder list(java.util.List<List> list) {
            this.list = list;
            return this;
        }

        /**
         * maxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * nextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * totalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListModelPermissionsResponseBody build() {
            return new ListModelPermissionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListModelPermissionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListModelPermissionsResponseBody</p>
     */
    public static class Permissions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("deploy")
        private Boolean deploy;

        @com.aliyun.core.annotation.NameInMap("fineTune")
        private Boolean fineTune;

        @com.aliyun.core.annotation.NameInMap("inference")
        private Boolean inference;

        private Permissions(Builder builder) {
            this.deploy = builder.deploy;
            this.fineTune = builder.fineTune;
            this.inference = builder.inference;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Permissions create() {
            return builder().build();
        }

        /**
         * @return deploy
         */
        public Boolean getDeploy() {
            return this.deploy;
        }

        /**
         * @return fineTune
         */
        public Boolean getFineTune() {
            return this.fineTune;
        }

        /**
         * @return inference
         */
        public Boolean getInference() {
            return this.inference;
        }

        public static final class Builder {
            private Boolean deploy; 
            private Boolean fineTune; 
            private Boolean inference; 

            private Builder() {
            } 

            private Builder(Permissions model) {
                this.deploy = model.deploy;
                this.fineTune = model.fineTune;
                this.inference = model.inference;
            } 

            /**
             * deploy.
             */
            public Builder deploy(Boolean deploy) {
                this.deploy = deploy;
                return this;
            }

            /**
             * fineTune.
             */
            public Builder fineTune(Boolean fineTune) {
                this.fineTune = fineTune;
                return this;
            }

            /**
             * inference.
             */
            public Builder inference(Boolean inference) {
                this.inference = inference;
                return this;
            }

            public Permissions build() {
                return new Permissions(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListModelPermissionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListModelPermissionsResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("model")
        private String model;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("permissions")
        private Permissions permissions;

        private List(Builder builder) {
            this.model = builder.model;
            this.name = builder.name;
            this.permissions = builder.permissions;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return model
         */
        public String getModel() {
            return this.model;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return permissions
         */
        public Permissions getPermissions() {
            return this.permissions;
        }

        public static final class Builder {
            private String model; 
            private String name; 
            private Permissions permissions; 

            private Builder() {
            } 

            private Builder(List model) {
                this.model = model.model;
                this.name = model.name;
                this.permissions = model.permissions;
            } 

            /**
             * model.
             */
            public Builder model(String model) {
                this.model = model;
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
             * permissions.
             */
            public Builder permissions(Permissions permissions) {
                this.permissions = permissions;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
}
