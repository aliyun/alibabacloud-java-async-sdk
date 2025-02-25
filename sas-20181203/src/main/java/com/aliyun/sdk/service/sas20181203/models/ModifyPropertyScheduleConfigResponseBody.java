// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link ModifyPropertyScheduleConfigResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyPropertyScheduleConfigResponseBody</p>
 */
public class ModifyPropertyScheduleConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ModifyResult")
    private Boolean modifyResult;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ModifyPropertyScheduleConfigResponseBody(Builder builder) {
        this.modifyResult = builder.modifyResult;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyPropertyScheduleConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return modifyResult
     */
    public Boolean getModifyResult() {
        return this.modifyResult;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Boolean modifyResult; 
        private String requestId; 

        /**
         * <p>Indicates whether the collection frequency of asset fingerprints is modified. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: yes</li>
         * <li><strong>false</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder modifyResult(Boolean modifyResult) {
            this.modifyResult = modifyResult;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>C0D1DF51-D879-55A8-B6C7-7D3B913EF34D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyPropertyScheduleConfigResponseBody build() {
            return new ModifyPropertyScheduleConfigResponseBody(this);
        } 

    } 

}
