// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agency20221216.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link EditZeroCreditShutdownRequest} extends {@link RequestModel}
 *
 * <p>EditZeroCreditShutdownRequest</p>
 */
public class EditZeroCreditShutdownRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ShutdownPolicy")
    private String shutdownPolicy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uid")
    private Long uid;

    private EditZeroCreditShutdownRequest(Builder builder) {
        super(builder);
        this.shutdownPolicy = builder.shutdownPolicy;
        this.uid = builder.uid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EditZeroCreditShutdownRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return shutdownPolicy
     */
    public String getShutdownPolicy() {
        return this.shutdownPolicy;
    }

    /**
     * @return uid
     */
    public Long getUid() {
        return this.uid;
    }

    public static final class Builder extends Request.Builder<EditZeroCreditShutdownRequest, Builder> {
        private String shutdownPolicy; 
        private Long uid; 

        private Builder() {
            super();
        } 

        private Builder(EditZeroCreditShutdownRequest request) {
            super(request);
            this.shutdownPolicy = request.shutdownPolicy;
            this.uid = request.uid;
        } 

        /**
         * <p>UID</p>
         * 
         * <strong>example:</strong>
         * <p>Shutdown Policy</br></p>
         * <ul>
         * <li><p>immediatelyStop, The instances of the specified End User&quot;s account will be shutdown immediately once EU triggered the Shutdown Policy.</br></p>
         * </li>
         * <li><p>delayStop, The instances of the specified End User&quot;s account will be shutdown later, even EU have triggered the Shutdown Policy.</br></p>
         * </li>
         * <li><p>noStop, The instances of the specified End User&quot;s account will not be shutdown, after EU have triggered the Shutdown Policy.</br></p>
         * </li>
         * </ul>
         */
        public Builder shutdownPolicy(String shutdownPolicy) {
            this.putQueryParameter("ShutdownPolicy", shutdownPolicy);
            this.shutdownPolicy = shutdownPolicy;
            return this;
        }

        /**
         * <p>No Change History</p>
         * 
         * <strong>example:</strong>
         * <p>1263644979775567</p>
         */
        public Builder uid(Long uid) {
            this.putQueryParameter("Uid", uid);
            this.uid = uid;
            return this;
        }

        @Override
        public EditZeroCreditShutdownRequest build() {
            return new EditZeroCreditShutdownRequest(this);
        } 

    } 

}
