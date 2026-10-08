// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

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
 * {@link TrimPolicy} extends {@link TeaModel}
 *
 * <p>TrimPolicy</p>
 */
public class TrimPolicy extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DisableDeleteEmptyCell")
    private Boolean disableDeleteEmptyCell;

    @com.aliyun.core.annotation.NameInMap("DisableDeleteRepeatedStyle")
    private Boolean disableDeleteRepeatedStyle;

    @com.aliyun.core.annotation.NameInMap("DisableDeleteUnusedPicture")
    private Boolean disableDeleteUnusedPicture;

    @com.aliyun.core.annotation.NameInMap("DisableDeleteUnusedShape")
    private Boolean disableDeleteUnusedShape;

    private TrimPolicy(Builder builder) {
        this.disableDeleteEmptyCell = builder.disableDeleteEmptyCell;
        this.disableDeleteRepeatedStyle = builder.disableDeleteRepeatedStyle;
        this.disableDeleteUnusedPicture = builder.disableDeleteUnusedPicture;
        this.disableDeleteUnusedShape = builder.disableDeleteUnusedShape;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TrimPolicy create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return disableDeleteEmptyCell
     */
    public Boolean getDisableDeleteEmptyCell() {
        return this.disableDeleteEmptyCell;
    }

    /**
     * @return disableDeleteRepeatedStyle
     */
    public Boolean getDisableDeleteRepeatedStyle() {
        return this.disableDeleteRepeatedStyle;
    }

    /**
     * @return disableDeleteUnusedPicture
     */
    public Boolean getDisableDeleteUnusedPicture() {
        return this.disableDeleteUnusedPicture;
    }

    /**
     * @return disableDeleteUnusedShape
     */
    public Boolean getDisableDeleteUnusedShape() {
        return this.disableDeleteUnusedShape;
    }

    public static final class Builder {
        private Boolean disableDeleteEmptyCell; 
        private Boolean disableDeleteRepeatedStyle; 
        private Boolean disableDeleteUnusedPicture; 
        private Boolean disableDeleteUnusedShape; 

        private Builder() {
        } 

        private Builder(TrimPolicy model) {
            this.disableDeleteEmptyCell = model.disableDeleteEmptyCell;
            this.disableDeleteRepeatedStyle = model.disableDeleteRepeatedStyle;
            this.disableDeleteUnusedPicture = model.disableDeleteUnusedPicture;
            this.disableDeleteUnusedShape = model.disableDeleteUnusedShape;
        } 

        /**
         * <p>Specifies whether to prevent all empty cells from being deleted. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder disableDeleteEmptyCell(Boolean disableDeleteEmptyCell) {
            this.disableDeleteEmptyCell = disableDeleteEmptyCell;
            return this;
        }

        /**
         * <p>Specifies whether to prevent all duplicate styles from being deleted. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder disableDeleteRepeatedStyle(Boolean disableDeleteRepeatedStyle) {
            this.disableDeleteRepeatedStyle = disableDeleteRepeatedStyle;
            return this;
        }

        /**
         * <p>Specifies whether to prevent unused cell images from being deleted. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder disableDeleteUnusedPicture(Boolean disableDeleteUnusedPicture) {
            this.disableDeleteUnusedPicture = disableDeleteUnusedPicture;
            return this;
        }

        /**
         * <p>Specifies whether to prevent unused shapes from being deleted. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder disableDeleteUnusedShape(Boolean disableDeleteUnusedShape) {
            this.disableDeleteUnusedShape = disableDeleteUnusedShape;
            return this;
        }

        public TrimPolicy build() {
            return new TrimPolicy(this);
        } 

    } 

}
