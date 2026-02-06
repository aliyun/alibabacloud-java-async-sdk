// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link DescribeParameterTimedScheduleTaskRequest} extends {@link RequestModel}
 *
 * <p>DescribeParameterTimedScheduleTaskRequest</p>
 */
public class DescribeParameterTimedScheduleTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbInstanceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dbInstanceName;

    private DescribeParameterTimedScheduleTaskRequest(Builder builder) {
        super(builder);
        this.dbInstanceName = builder.dbInstanceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeParameterTimedScheduleTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dbInstanceName
     */
    public String getDbInstanceName() {
        return this.dbInstanceName;
    }

    public static final class Builder extends Request.Builder<DescribeParameterTimedScheduleTaskRequest, Builder> {
        private String dbInstanceName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeParameterTimedScheduleTaskRequest request) {
            super(request);
            this.dbInstanceName = request.dbInstanceName;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-2ze2za3is7baay****</p>
         */
        public Builder dbInstanceName(String dbInstanceName) {
            this.putQueryParameter("DbInstanceName", dbInstanceName);
            this.dbInstanceName = dbInstanceName;
            return this;
        }

        @Override
        public DescribeParameterTimedScheduleTaskRequest build() {
            return new DescribeParameterTimedScheduleTaskRequest(this);
        } 

    } 

}
