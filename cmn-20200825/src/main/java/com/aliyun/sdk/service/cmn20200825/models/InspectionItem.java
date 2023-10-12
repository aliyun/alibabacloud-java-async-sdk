// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InspectionItem} extends {@link TeaModel}
 *
 * <p>InspectionItem</p>
 */
public class InspectionItem extends TeaModel {
    @NameInMap("InspectionCrontab")
    private String inspectionCrontab;

    @NameInMap("ItemDescription")
    private String itemDescription;

    @NameInMap("ItemId")
    private String itemId;

    @NameInMap("ItemName")
    private String itemName;

    private InspectionItem(Builder builder) {
        this.inspectionCrontab = builder.inspectionCrontab;
        this.itemDescription = builder.itemDescription;
        this.itemId = builder.itemId;
        this.itemName = builder.itemName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InspectionItem create() {
        return builder().build();
    }

    /**
     * @return inspectionCrontab
     */
    public String getInspectionCrontab() {
        return this.inspectionCrontab;
    }

    /**
     * @return itemDescription
     */
    public String getItemDescription() {
        return this.itemDescription;
    }

    /**
     * @return itemId
     */
    public String getItemId() {
        return this.itemId;
    }

    /**
     * @return itemName
     */
    public String getItemName() {
        return this.itemName;
    }

    public static final class Builder {
        private String inspectionCrontab; 
        private String itemDescription; 
        private String itemId; 
        private String itemName; 

        /**
         * InspectionCrontab.
         */
        public Builder inspectionCrontab(String inspectionCrontab) {
            this.inspectionCrontab = inspectionCrontab;
            return this;
        }

        /**
         * ItemDescription.
         */
        public Builder itemDescription(String itemDescription) {
            this.itemDescription = itemDescription;
            return this;
        }

        /**
         * ItemId.
         */
        public Builder itemId(String itemId) {
            this.itemId = itemId;
            return this;
        }

        /**
         * ItemName.
         */
        public Builder itemName(String itemName) {
            this.itemName = itemName;
            return this;
        }

        public InspectionItem build() {
            return new InspectionItem(this);
        } 

    } 

}
