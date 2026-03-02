// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link PbcRepoForkListResult} extends {@link TeaModel}
 *
 * <p>PbcRepoForkListResult</p>
 */
public class PbcRepoForkListResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("reposForks")
    private java.util.List<ReposFork> reposForks;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private PbcRepoForkListResult(Builder builder) {
        this.reposForks = builder.reposForks;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PbcRepoForkListResult create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return reposForks
     */
    public java.util.List<ReposFork> getReposForks() {
        return this.reposForks;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<ReposFork> reposForks; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(PbcRepoForkListResult model) {
            this.reposForks = model.reposForks;
            this.requestId = model.requestId;
        } 

        /**
         * reposForks.
         */
        public Builder reposForks(java.util.List<ReposFork> reposForks) {
            this.reposForks = reposForks;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public PbcRepoForkListResult build() {
            return new PbcRepoForkListResult(this);
        } 

    } 

}
