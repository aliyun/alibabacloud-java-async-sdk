// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DescribeExposedInstanceCriteriaRequest} extends {@link RequestModel}
 *
 * <p>DescribeExposedInstanceCriteriaRequest</p>
 */
public class DescribeExposedInstanceCriteriaRequest extends Request {
    @Query
    @NameInMap("Value")
    private String value;


    private DescribeExposedInstanceCriteriaRequest(Builder builder) {
        super(builder);
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeExposedInstanceCriteriaRequest create() {
        return builder().build();
    }

    /**
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    public static final class Builder extends Request.Builder {
        private String value; 

        /**
         * <p>Value.</p>
         */
        public Builder value(String value) {
            this.putQueryParameter("Value", value);
            this.value = value;
            return this;
        }

        public DescribeExposedInstanceCriteriaRequest build() {
            return new DescribeExposedInstanceCriteriaRequest(this);
        } 

    } 

}
