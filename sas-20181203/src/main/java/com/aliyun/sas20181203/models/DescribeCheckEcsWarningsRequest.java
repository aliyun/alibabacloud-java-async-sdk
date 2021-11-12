// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DescribeCheckEcsWarningsRequest} extends {@link RequestModel}
 *
 * <p>DescribeCheckEcsWarningsRequest</p>
 */
public class DescribeCheckEcsWarningsRequest extends Request {
    @Query
    @NameInMap("SourceIp")
    private String sourceIp;


    private DescribeCheckEcsWarningsRequest(Builder builder) {
        super(builder);
        this.sourceIp = builder.sourceIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCheckEcsWarningsRequest create() {
        return builder().build();
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    public static final class Builder extends Request.Builder {
        private String sourceIp; 

        /**
         * <p>SourceIp.</p>
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        public DescribeCheckEcsWarningsRequest build() {
            return new DescribeCheckEcsWarningsRequest(this);
        } 

    } 

}
