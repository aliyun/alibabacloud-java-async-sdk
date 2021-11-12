// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DescribeUserBackupMachinesRequest} extends {@link RequestModel}
 *
 * <p>DescribeUserBackupMachinesRequest</p>
 */
public class DescribeUserBackupMachinesRequest extends Request {

    private DescribeUserBackupMachinesRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUserBackupMachinesRequest create() {
        return builder().build();
    }

    public static final class Builder extends Request.Builder {

        public DescribeUserBackupMachinesRequest build() {
            return new DescribeUserBackupMachinesRequest(this);
        } 

    } 

}
