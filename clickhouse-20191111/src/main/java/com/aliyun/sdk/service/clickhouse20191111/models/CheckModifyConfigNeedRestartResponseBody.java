// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

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
 * {@link CheckModifyConfigNeedRestartResponseBody} extends {@link TeaModel}
 *
 * <p>CheckModifyConfigNeedRestartResponseBody</p>
 */
public class CheckModifyConfigNeedRestartResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NeedRestart")
    private Boolean needRestart;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CheckModifyConfigNeedRestartResponseBody(Builder builder) {
        this.needRestart = builder.needRestart;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckModifyConfigNeedRestartResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return needRestart
     */
    public Boolean getNeedRestart() {
        return this.needRestart;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Boolean needRestart; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CheckModifyConfigNeedRestartResponseBody model) {
            this.needRestart = model.needRestart;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Indicates whether a restart is required after the configuration parameters are modified. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: A restart is required.</li>
         * <li><strong>false</strong>: No restart is required.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder needRestart(Boolean needRestart) {
            this.needRestart = needRestart;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>06798FEE-BEF2-5FAF-A30D-728973BBE97C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CheckModifyConfigNeedRestartResponseBody build() {
            return new CheckModifyConfigNeedRestartResponseBody(this);
        } 

    } 

}
