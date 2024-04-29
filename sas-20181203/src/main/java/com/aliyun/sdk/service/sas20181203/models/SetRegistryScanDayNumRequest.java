// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetRegistryScanDayNumRequest} extends {@link RequestModel}
 *
 * <p>SetRegistryScanDayNumRequest</p>
 */
public class SetRegistryScanDayNumRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScanDayNum")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer scanDayNum;

    private SetRegistryScanDayNumRequest(Builder builder) {
        super(builder);
        this.scanDayNum = builder.scanDayNum;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetRegistryScanDayNumRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return scanDayNum
     */
    public Integer getScanDayNum() {
        return this.scanDayNum;
    }

    public static final class Builder extends Request.Builder<SetRegistryScanDayNumRequest, Builder> {
        private Integer scanDayNum; 

        private Builder() {
            super();
        } 

        private Builder(SetRegistryScanDayNumRequest request) {
            super(request);
            this.scanDayNum = request.scanDayNum;
        } 

        /**
         * The cycle at which you want to scan your images. Unit: days.
         */
        public Builder scanDayNum(Integer scanDayNum) {
            this.putQueryParameter("ScanDayNum", scanDayNum);
            this.scanDayNum = scanDayNum;
            return this;
        }

        @Override
        public SetRegistryScanDayNumRequest build() {
            return new SetRegistryScanDayNumRequest(this);
        } 

    } 

}
