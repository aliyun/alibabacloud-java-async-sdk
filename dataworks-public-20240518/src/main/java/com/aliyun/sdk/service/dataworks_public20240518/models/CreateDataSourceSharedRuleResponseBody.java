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
 * {@link CreateDataSourceSharedRuleResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDataSourceSharedRuleResponseBody</p>
 */
public class CreateDataSourceSharedRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateDataSourceSharedRuleResponseBody(Builder builder) {
        this.id = builder.id;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDataSourceSharedRuleResponseBody create() {
        return builder().build();
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
        private Long id; 
        private String requestId; 

        /**
         * <p>The sharing rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>105412</p>
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * <p>The ID of the request. It is used to locate logs and troubleshoot problems.</p>
         * 
         * <strong>example:</strong>
         * <p>46F594E6-84AB-5FA5-8144-6F3D149961E1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateDataSourceSharedRuleResponseBody build() {
            return new CreateDataSourceSharedRuleResponseBody(this);
        } 

    } 

}
