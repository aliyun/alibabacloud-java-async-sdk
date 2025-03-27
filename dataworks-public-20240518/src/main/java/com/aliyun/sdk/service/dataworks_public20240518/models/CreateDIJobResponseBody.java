// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link CreateDIJobResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDIJobResponseBody</p>
 */
public class CreateDIJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DIJobId")
    @Deprecated
    private Long DIJobId;

    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateDIJobResponseBody(Builder builder) {
        this.DIJobId = builder.DIJobId;
        this.id = builder.id;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDIJobResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DIJobId
     */
    public Long getDIJobId() {
        return this.DIJobId;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long DIJobId; 
        private Long id; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateDIJobResponseBody model) {
            this.DIJobId = model.DIJobId;
            this.id = model.id;
            this.requestId = model.requestId;
        } 

        /**
         * <p>This parameter is deprecated and is replaced by the Id parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>11792</p>
         */
        public Builder DIJobId(Long DIJobId) {
            this.DIJobId = DIJobId;
            return this;
        }

        /**
         * <p>The ID of the synchronization task.</p>
         * 
         * <strong>example:</strong>
         * <p>11792</p>
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * <p>The request ID. You can use the ID to query logs and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>4F6AB6B3-41FB-5EBB-AFB2-0C98D49DA2BB</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateDIJobResponseBody build() {
            return new CreateDIJobResponseBody(this);
        } 

    } 

}
