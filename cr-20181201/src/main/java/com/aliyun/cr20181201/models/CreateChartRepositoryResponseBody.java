// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link CreateChartRepositoryResponseBody} extends {@link TeaModel}
 *
 * <p>CreateChartRepositoryResponseBody</p>
 */
public class CreateChartRepositoryResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("RepoId")
    private String repoId;

    @NameInMap("IsSuccess")
    private Boolean isSuccess;

    @NameInMap("RequestId")
    private String requestId;


    private CreateChartRepositoryResponseBody(Builder builder) {
        this.code = builder.code;
        this.repoId = builder.repoId;
        this.isSuccess = builder.isSuccess;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateChartRepositoryResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return repoId
     */
    public String getRepoId() {
        return this.repoId;
    }

    /**
     * @return isSuccess
     */
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private String repoId; 
        private Boolean isSuccess; 
        private String requestId; 

        /**
         * <p>Return value</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Mirror warehouse ID</p>
         */
        public Builder repoId(String repoId) {
            this.repoId = repoId;
            return this;
        }

        /**
         * <p>Indicates whether the API is called. Valid values:

-"true": The API is called.

-"false": failed to call the API.</p>
         */
        public Builder isSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }

        /**
         * <p>Request ID</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateChartRepositoryResponseBody build() {
            return new CreateChartRepositoryResponseBody(this);
        } 

    } 

}
