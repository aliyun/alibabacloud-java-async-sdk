// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRetcodeShareUrlRequest} extends {@link RequestModel}
 *
 * <p>GetRetcodeShareUrlRequest</p>
 */
public class GetRetcodeShareUrlRequest extends Request {
    @Query
    @NameInMap("Pid")
    @Validation(required = true)
    private String pid;

    private GetRetcodeShareUrlRequest(Builder builder) {
        super(builder);
        this.pid = builder.pid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRetcodeShareUrlRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pid
     */
    public String getPid() {
        return this.pid;
    }

    public static final class Builder extends Request.Builder<GetRetcodeShareUrlRequest, Builder> {
        private String pid; 

        private Builder() {
            super();
        } 

        private Builder(GetRetcodeShareUrlRequest request) {
            super(request);
            this.pid = request.pid;
        } 

        /**
         * The process identifier (PID) of the application. For more information about how to obtain the PID, see [Obtain the PID of an application](https://www.alibabacloud.com/help/zh/doc-detail/186100.htm?spm=a2cdw.13409063.0.0.7a72281f0bkTfx#title-imy-7gj-qhr).
         */
        public Builder pid(String pid) {
            this.putQueryParameter("Pid", pid);
            this.pid = pid;
            return this;
        }

        @Override
        public GetRetcodeShareUrlRequest build() {
            return new GetRetcodeShareUrlRequest(this);
        } 

    } 

}
