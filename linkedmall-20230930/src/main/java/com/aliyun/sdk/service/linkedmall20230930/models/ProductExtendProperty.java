// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20230930.models;

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
 * {@link ProductExtendProperty} extends {@link TeaModel}
 *
 * <p>ProductExtendProperty</p>
 */
public class ProductExtendProperty extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("key")
    private String key;

    @com.aliyun.core.annotation.NameInMap("value")
    private String value;

    private ProductExtendProperty(Builder builder) {
        this.key = builder.key;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ProductExtendProperty create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return key
     */
    public String getKey() {
        return this.key;
    }

    /**
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    public static final class Builder {
        private String key; 
        private String value; 

        private Builder() {
        } 

        private Builder(ProductExtendProperty model) {
            this.key = model.key;
            this.value = model.value;
        } 

        /**
         * <p>The property key.</p>
         * <blockquote>
         * <p>Valid values:</p>
         * <ul>
         * <li><ul>
         * <li><code>ss_picture_scene</code> (scene picture)</li>
         * </ul>
         * </li>
         * <li><ul>
         * <li><code>ss_picture_white_background</code> (white background picture)</li>
         * </ul>
         * </li>
         * <li><ul>
         * <li><code>extraPeriod</code> (shelf life)</li>
         * </ul>
         * </li>
         * <li><ul>
         * <li><code>itemBoundaryInventoryZeroTag</code> (Reserved. Ignore this parameter.)</li>
         * </ul>
         * </li>
         * <li><ul>
         * <li><code>shoppingShowTitle</code> (shopping guide title)</li>
         * </ul>
         * </li>
         * <li><ul>
         * <li><code>itemCCStatus</code> (Reserved. Ignore this parameter.)</li>
         * </ul>
         * </li>
         * <li><ul>
         * <li><code>brandLogo</code> (brand logo)</li>
         * </ul>
         * </li>
         * <li><ul>
         * <li><code>multipleBuyLimit</code> (purchase multiple)</li>
         * </ul>
         * </li>
         * <li><ul>
         * <li><code>eticket_type</code> (electronic coupon type)</li>
         * </ul>
         * </li>
         * <li><ul>
         * <li><code>eticket_upper_buy_limit</code> (maximum purchase quantity of electronic coupons per order)</li>
         * </ul>
         * </li>
         * <li><ul>
         * <li><code>validity_type</code> (validity period type of electronic coupon)</li>
         * </ul>
         * </li>
         * <li><ul>
         * <li><code>etc_expiry_date</code> (Validity period of the electronic coupon. Valid only when <code>validity_type</code> is <code>1</code>.)</li>
         * </ul>
         * </li>
         * <li><ul>
         * <li><code>etc_duration_date</code> (Validity period of the electronic coupon. Valid only when <code>validity_type</code> is <code>2</code>, <code>3</code>, or <code>5</code>.)</li>
         * </ul>
         * </li>
         * <li><ul>
         * <li><code>f_refund</code> (Automatic refund ratio for valid electronic coupons)</li>
         * </ul>
         * </li>
         * <li><ul>
         * <li><code>refund</code> (automatic refund ratio for expired electronic coupons)</li>
         * </ul>
         * </li>
         * <li><ul>
         * <li><code>writeoff</code> (Reserved. Ignore this parameter.)</li>
         * </ul>
         * </li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ss_picture_scene</p>
         */
        public Builder key(String key) {
            this.key = key;
            return this;
        }

        /**
         * <p>The property value.</p>
         * 
         * <strong>example:</strong>
         * <p>场景图</p>
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }

        public ProductExtendProperty build() {
            return new ProductExtendProperty(this);
        } 

    } 

}
