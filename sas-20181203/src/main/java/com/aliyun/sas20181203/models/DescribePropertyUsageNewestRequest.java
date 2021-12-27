// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DescribePropertyUsageNewestRequest} extends {@link RequestModel}
 *
 * <p>DescribePropertyUsageNewestRequest</p>
 */
public class DescribePropertyUsageNewestRequest extends Request {
    @Query
    @NameInMap("Type")
    private String type;


    private DescribePropertyUsageNewestRequest(Builder builder) {
        super(builder);
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePropertyUsageNewestRequest create() {
        return builder().build();
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<Builder> {
        private String type; 

        /**
         * <p>Type.</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        public DescribePropertyUsageNewestRequest build() {
            return new DescribePropertyUsageNewestRequest(this);
        } 

    } 

}
