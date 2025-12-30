// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link AlterSearchLibResponseBody} extends {@link TeaModel}
 *
 * <p>AlterSearchLibResponseBody</p>
 */
public class AlterSearchLibResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SearchLibName")
    private String searchLibName;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    private AlterSearchLibResponseBody(Builder builder) {
        this.code = builder.code;
        this.requestId = builder.requestId;
        this.searchLibName = builder.searchLibName;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AlterSearchLibResponseBody create() {
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return searchLibName
     */
    public String getSearchLibName() {
        return this.searchLibName;
    }

    /**
     * @return success
     */
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private String requestId; 
        private String searchLibName; 
        private String success; 

        private Builder() {
        } 

        private Builder(AlterSearchLibResponseBody model) {
            this.code = model.code;
            this.requestId = model.requestId;
            this.searchLibName = model.searchLibName;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SearchLibName.
         */
        public Builder searchLibName(String searchLibName) {
            this.searchLibName = searchLibName;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public AlterSearchLibResponseBody build() {
            return new AlterSearchLibResponseBody(this);
        } 

    } 

}
