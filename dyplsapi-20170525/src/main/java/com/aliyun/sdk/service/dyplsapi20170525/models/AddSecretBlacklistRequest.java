// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyplsapi20170525.models;

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
 * {@link AddSecretBlacklistRequest} extends {@link RequestModel}
 *
 * <p>AddSecretBlacklistRequest</p>
 */
public class AddSecretBlacklistRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BlackNo")
    @com.aliyun.core.annotation.Validation(required = true)
    private String blackNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BlackType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String blackType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PoolKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String poolKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WayControl")
    private String wayControl;

    private AddSecretBlacklistRequest(Builder builder) {
        super(builder);
        this.blackNo = builder.blackNo;
        this.blackType = builder.blackType;
        this.poolKey = builder.poolKey;
        this.remark = builder.remark;
        this.wayControl = builder.wayControl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddSecretBlacklistRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return blackNo
     */
    public String getBlackNo() {
        return this.blackNo;
    }

    /**
     * @return blackType
     */
    public String getBlackType() {
        return this.blackType;
    }

    /**
     * @return poolKey
     */
    public String getPoolKey() {
        return this.poolKey;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @return wayControl
     */
    public String getWayControl() {
        return this.wayControl;
    }

    public static final class Builder extends Request.Builder<AddSecretBlacklistRequest, Builder> {
        private String blackNo; 
        private String blackType; 
        private String poolKey; 
        private String remark; 
        private String wayControl; 

        private Builder() {
            super();
        } 

        private Builder(AddSecretBlacklistRequest request) {
            super(request);
            this.blackNo = request.blackNo;
            this.blackType = request.blackType;
            this.poolKey = request.poolKey;
            this.remark = request.remark;
            this.wayControl = request.wayControl;
        } 

        /**
         * <p>The blacklisted phone number. The value type depends on the <strong>BlackType</strong> parameter:</p>
         * <ul>
         * <li><strong>Point-to-point blacklist</strong>: A pair of numbers (A and B numbers) separated by a colon (:).</li>
         * <li><strong>Number pool blacklist</strong>: A single number.</li>
         * </ul>
         * <blockquote>
         * <p>(\*) is not a wildcard.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1825638****:1825248****</p>
         */
        public Builder blackNo(String blackNo) {
            this.putQueryParameter("BlackNo", blackNo);
            this.blackNo = blackNo;
            return this;
        }

        /**
         * <p>The blacklist type. Valid values:</p>
         * <ul>
         * <li><strong>POINT_TO_POINT_BLACK</strong>: point-to-point blacklist.</li>
         * <li><strong>PARTNER_GLOBAL_NUMBER_BLACK</strong>: number pool blacklist.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>POINT_TO_POINT_BLACK</p>
         */
        public Builder blackType(String blackType) {
            this.putQueryParameter("BlackType", blackType);
            this.blackType = blackType;
            return this;
        }

        /**
         * <p>The key of the number pool.</p>
         * <p>You can obtain the <strong>number pool key</strong> on the <a href="https://dyplsnext.console.aliyun.com/number-pool">Number Pool Management</a> page in the privacy protection console.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>FC2235****</p>
         */
        public Builder poolKey(String poolKey) {
            this.putQueryParameter("PoolKey", poolKey);
            this.poolKey = poolKey;
            return this;
        }

        /**
         * <p>The remarks for the blacklist entry.</p>
         * 
         * <strong>example:</strong>
         * <p>Blacklist remarks</p>
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * <p>The call direction control. Valid values:</p>
         * <ul>
         * <li><strong>PHONEA_REJECT</strong>: The first number in BlackNo can call the second number, but the second number cannot call the first number.</li>
         * <li><strong>PHONEB_REJECT</strong>: The first number in BlackNo cannot call the second number, but the second number can call the first number.</li>
         * <li><strong>Not specified</strong>: The two numbers in BlackNo cannot call each other.</li>
         * </ul>
         * <blockquote>
         * <p>This parameter takes effect only for point-to-point blacklists.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>PHONEA_REJECT</p>
         */
        public Builder wayControl(String wayControl) {
            this.putQueryParameter("WayControl", wayControl);
            this.wayControl = wayControl;
            return this;
        }

        @Override
        public AddSecretBlacklistRequest build() {
            return new AddSecretBlacklistRequest(this);
        } 

    } 

}
