// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link GetRoutineCodeVersionResponseBody} extends {@link TeaModel}
 *
 * <p>GetRoutineCodeVersionResponseBody</p>
 */
public class GetRoutineCodeVersionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CodeDescription")
    private String codeDescription;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RoutineCode")
    private String routineCode;

    private GetRoutineCodeVersionResponseBody(Builder builder) {
        this.codeDescription = builder.codeDescription;
        this.createTime = builder.createTime;
        this.requestId = builder.requestId;
        this.routineCode = builder.routineCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRoutineCodeVersionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return codeDescription
     */
    public String getCodeDescription() {
        return this.codeDescription;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return routineCode
     */
    public String getRoutineCode() {
        return this.routineCode;
    }

    public static final class Builder {
        private String codeDescription; 
        private String createTime; 
        private String requestId; 
        private String routineCode; 

        private Builder() {
        } 

        private Builder(GetRoutineCodeVersionResponseBody model) {
            this.codeDescription = model.codeDescription;
            this.createTime = model.createTime;
            this.requestId = model.requestId;
            this.routineCode = model.routineCode;
        } 

        /**
         * CodeDescription.
         */
        public Builder codeDescription(String codeDescription) {
            this.codeDescription = codeDescription;
            return this;
        }

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>Id of the request</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * RoutineCode.
         */
        public Builder routineCode(String routineCode) {
            this.routineCode = routineCode;
            return this;
        }

        public GetRoutineCodeVersionResponseBody build() {
            return new GetRoutineCodeVersionResponseBody(this);
        } 

    } 

}
