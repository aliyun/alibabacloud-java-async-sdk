// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apds20220331.models;

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
 * {@link DescribeSurveyJobCountResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSurveyJobCountResponseBody</p>
 */
public class DescribeSurveyJobCountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Object data;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("error")
    private String error;

    private DescribeSurveyJobCountResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.success = builder.success;
        this.error = builder.error;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSurveyJobCountResponseBody create() {
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
     * @return data
     */
    public Object getData() {
        return this.data;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return error
     */
    public String getError() {
        return this.error;
    }

    public static final class Builder {
        private String code; 
        private Object data; 
        private Boolean success; 
        private String error; 

        private Builder() {
        } 

        private Builder(DescribeSurveyJobCountResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.success = model.success;
            this.error = model.error;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Object data) {
            this.data = data;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * error.
         */
        public Builder error(String error) {
            this.error = error;
            return this;
        }

        public DescribeSurveyJobCountResponseBody build() {
            return new DescribeSurveyJobCountResponseBody(this);
        } 

    } 

}
