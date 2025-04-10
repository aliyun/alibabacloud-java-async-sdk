// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20171228.models;

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
 * {@link DescribeDomainSlsStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainSlsStatusResponseBody</p>
 */
public class DescribeDomainSlsStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SlsLogstore")
    private String slsLogstore;

    @com.aliyun.core.annotation.NameInMap("SlsProject")
    private String slsProject;

    @com.aliyun.core.annotation.NameInMap("SlsStatus")
    private Boolean slsStatus;

    private DescribeDomainSlsStatusResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.slsLogstore = builder.slsLogstore;
        this.slsProject = builder.slsProject;
        this.slsStatus = builder.slsStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainSlsStatusResponseBody create() {
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
     * @return slsLogstore
     */
    public String getSlsLogstore() {
        return this.slsLogstore;
    }

    /**
     * @return slsProject
     */
    public String getSlsProject() {
        return this.slsProject;
    }

    /**
     * @return slsStatus
     */
    public Boolean getSlsStatus() {
        return this.slsStatus;
    }

    public static final class Builder {
        private String requestId; 
        private String slsLogstore; 
        private String slsProject; 
        private Boolean slsStatus; 

        private Builder() {
        } 

        private Builder(DescribeDomainSlsStatusResponseBody model) {
            this.requestId = model.requestId;
            this.slsLogstore = model.slsLogstore;
            this.slsProject = model.slsProject;
            this.slsStatus = model.slsStatus;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SlsLogstore.
         */
        public Builder slsLogstore(String slsLogstore) {
            this.slsLogstore = slsLogstore;
            return this;
        }

        /**
         * SlsProject.
         */
        public Builder slsProject(String slsProject) {
            this.slsProject = slsProject;
            return this;
        }

        /**
         * SlsStatus.
         */
        public Builder slsStatus(Boolean slsStatus) {
            this.slsStatus = slsStatus;
            return this;
        }

        public DescribeDomainSlsStatusResponseBody build() {
            return new DescribeDomainSlsStatusResponseBody(this);
        } 

    } 

}
